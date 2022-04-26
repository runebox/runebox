package io.runebox.asm

import io.runebox.util.property
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode

internal fun ClassNode.init(pool: ClassPool) {
    this.pool = pool
    this.methods.forEach { it.init(this) }
    this.fields.forEach { it.init(this) }
}

var ClassNode.pool: ClassPool by property()
    internal set

val ClassNode.identifier get() = name

fun ClassNode.toByteArray(): ByteArray {
    val writer = ClassWriter(ClassWriter.COMPUTE_MAXS)
    this.accept(writer)
    return writer.toByteArray()
}
