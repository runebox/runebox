package io.runebox.asm

import io.runebox.util.property
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.Frame
import org.objectweb.asm.tree.analysis.SourceInterpreter
import org.objectweb.asm.tree.analysis.SourceValue

internal fun MethodNode.init(owner: ClassNode) {
    this.owner = owner
}

var MethodNode.owner: ClassNode by property()
    internal set

val MethodNode.pool get() = owner.pool

fun MethodNode.analyzeSource(): Map<AbstractInsnNode, Frame<SourceValue>>? {
    return try {
        val frames = hashMapOf<AbstractInsnNode, Frame<SourceValue>>()
        val framesArray = Analyzer(SourceInterpreter()).analyze(owner.name, this)
        for(i in framesArray.indices) {
            frames[instructions[i]] = framesArray[i]
        }
        frames
    } catch (e: Exception) {
        null
    }
}