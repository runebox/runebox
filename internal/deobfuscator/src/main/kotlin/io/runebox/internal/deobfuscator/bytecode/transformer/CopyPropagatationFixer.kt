package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool
import io.runebox.internal.deobfuscator.bytecode.asm.analysis.CopyPropagationAnalyzer
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.VarInsnNode
import org.tinylog.kotlin.Logger

class CopyPropagatationFixer : BytecodeTransformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                val analyzer = CopyPropagationAnalyzer(method)
                analyzer.analyze()

                for (insn in method.instructions) {
                    if (insn !is VarInsnNode || !LOAD_OPCODES.contains(insn.opcode)) {
                        continue
                    }

                    val set = analyzer.getInSet(insn) ?: continue
                    val assignment = set.singleOrNull { it.destination == insn.`var` } ?: continue
                    insn.`var` = assignment.source
                    count++
                }
            }
        }

        Logger.info("Propagated $count copy instructions.")
    }

    private companion object {
        private val LOAD_OPCODES = setOf(ILOAD, LLOAD, FLOAD, DLOAD, ALOAD)
    }
}