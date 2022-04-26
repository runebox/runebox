package io.runebox.deobfuscator.util

import com.javadeobfuscator.deobfuscator.matcher.InstructionMatcher
import com.javadeobfuscator.deobfuscator.matcher.Step
import org.objectweb.asm.tree.AbstractInsnNode

class PredicateStep(private val predicate: (AbstractInsnNode) -> Boolean) : Step {

    override fun tryMatch(matcher: InstructionMatcher, now: AbstractInsnNode): AbstractInsnNode? {
        if(predicate(now)) {
            return now.next
        }
        return null
    }

    override fun toString(): String {
        return "PredicateStep{ <code> }"
    }
}