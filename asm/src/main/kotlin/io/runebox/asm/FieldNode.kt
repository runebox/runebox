package io.runebox.asm

import io.runebox.util.property
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

internal fun FieldNode.init(owner: ClassNode) {
    this.owner = owner
}

var FieldNode.owner: ClassNode by property()
    internal set

val FieldNode.pool get() = owner.pool