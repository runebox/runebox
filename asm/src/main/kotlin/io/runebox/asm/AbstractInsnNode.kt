package io.runebox.asm

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.IntInsnNode
import org.objectweb.asm.tree.LdcInsnNode

fun AbstractInsnNode.isString() = this is LdcInsnNode && cst is String
fun AbstractInsnNode.isType() = this is LdcInsnNode && cst is Type

fun AbstractInsnNode.isInt(): Boolean {
    return opcode in ICONST_M1..ICONST_5
            || opcode == BIPUSH
            || opcode == SIPUSH
            || (this is LdcInsnNode && cst is Int)
}

fun AbstractInsnNode.isLong(): Boolean {
    return opcode == LCONST_0
            || opcode == LCONST_1
            || (this is LdcInsnNode && cst is Long)
}

fun AbstractInsnNode.isFloat(): Boolean {
    return (opcode in FCONST_0..FCONST_2)
            || (this is LdcInsnNode && cst is Float)
}

fun AbstractInsnNode.isDouble(): Boolean {
    return (opcode in DCONST_0..DCONST_1)
            || (this is LdcInsnNode && cst is Double)
}

fun AbstractInsnNode.isNumber() = isInt() || isLong() || isFloat() || isDouble()
fun AbstractInsnNode.isOperator() = opcode in IADD..LXOR && opcode != INEG

fun AbstractInsnNode.stringValue() = this.let { it as LdcInsnNode }.cst as String
fun AbstractInsnNode.typeValue() = this.let { it as LdcInsnNode }.cst as Type

fun AbstractInsnNode.intValue(): Int {
    if(opcode in ICONST_M1..ICONST_5) {
        return opcode - 3
    } else if(this is IntInsnNode && opcode != NEWARRAY) {
        return operand
    } else if(this is LdcInsnNode && cst is Int) {
        return cst as Int
    }
    throw IllegalArgumentException()
}

fun AbstractInsnNode.longValue(): Long {
    if(opcode in LCONST_0..LCONST_1) {
        return (opcode - 9).toLong()
    } else if(this is LdcInsnNode && cst is Long) {
        return cst as Long
    }
    throw IllegalArgumentException()
}

fun AbstractInsnNode.floatValue(): Float {
    if(opcode in FCONST_0..FCONST_2) {
        return (opcode - 11).toFloat()
    } else if(this is LdcInsnNode && cst is Float) {
        return cst as Float
    }
    throw IllegalArgumentException()
}

fun AbstractInsnNode.doubleValue(): Double {
    if(opcode in DCONST_0..DCONST_1) {
        return (opcode - 14).toDouble()
    } else if(this is LdcInsnNode && cst is Double) {
        return cst as Double
    }
    throw IllegalArgumentException()
}

fun AbstractInsnNode.numberValue(): Number = when {
    isInt() -> intValue()
    isLong() -> longValue()
    isDouble() -> doubleValue()
    isFloat() -> floatValue()
    else -> throw IllegalArgumentException()
}
