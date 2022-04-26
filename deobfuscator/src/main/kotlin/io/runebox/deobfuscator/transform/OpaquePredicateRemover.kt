package io.runebox.deobfuscator.transform

import com.javadeobfuscator.deobfuscator.matcher.*
import io.runebox.asm.*
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.util.PredicateStep
import io.runebox.util.toIntArray
import org.assertj.core.internal.asm.Type
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.*
import org.objectweb.asm.util.Printer
import org.tinylog.kotlin.Logger
import java.lang.IllegalStateException
import java.lang.reflect.Modifier

class OpaquePredicateRemover : Transformer {

    private var removedChecks = 0
    private var removedArgs = 0

    override fun execute(pool: ClassPool) {
        removeChecks(pool)
        removeArgs(pool)

        Logger.info("Removed $removedChecks opaque predicate checks.")
        Logger.info("Removed $removedArgs opaque predicate args.")
    }

    private fun removeChecks(pool: ClassPool) {
        pool.classes().forEach classLoop@ { cls ->
            cls.methods.forEach methodLoop@{ method ->
                val insns = method.instructions.iterator()
                while(insns.hasNext()) {
                    val insn = insns.next()
                    val matched = when {
                        method.matchesOpaqueReturnCheck(insn) -> 4
                        method.matchesOpaqueExceptionCheck(insn) -> 7
                        else -> continue
                    }
                    val label = (insn.next.next as JumpInsnNode).label.label
                    insns.remove()
                    repeat(matched - 1) {
                        insns.next()
                        insns.remove()
                    }
                    insns.add(JumpInsnNode(GOTO, LabelNode(label)))
                    removedChecks++
                }
            }
        }
    }

    private fun removeArgs(pool: ClassPool) {

    }

    private val MethodNode.lastArgumentIndex: Int get() {
        val offset = if(Modifier.isStatic(access)) 1 else 0
        return (Type.getArgumentsAndReturnSizes(desc) shr 2) - offset - 1
    }

    private fun MethodNode.matchesOpaqueExceptionCheck(insn: AbstractInsnNode): Boolean {
        val pattern = InstructionPattern(
            CapturingStep(OpcodeStep({ it is VarInsnNode && it.`var` == this.lastArgumentIndex }, ILOAD), "arg"),
            CapturingStep(LoadIntStep(), "opaque"),
            PredicateStep { it.isIf() },
            OpcodeStep(NEW),
            OpcodeStep(DUP),
            OpcodeStep({ it is MethodInsnNode && it.owner == Type.getInternalName(IllegalStateException::class.java) }, INVOKESPECIAL),
            OpcodeStep(ATHROW)
        )
        val matcher = InstructionMatcher(pattern, insn)
        return matcher.find()
    }

    private fun MethodNode.matchesOpaqueReturnCheck(insn: AbstractInsnNode): Boolean {
        val pattern = InstructionPattern(
            OpcodeStep({ it is VarInsnNode && it.`var` == this.lastArgumentIndex }, ILOAD),
            OpcodeStep({ it.isInt() }, LDC),
            PredicateStep { it.isIf() },
            PredicateStep { it.isReturn() }
        )
        val matcher = InstructionMatcher(pattern, insn)
        return matcher.find()
    }
}