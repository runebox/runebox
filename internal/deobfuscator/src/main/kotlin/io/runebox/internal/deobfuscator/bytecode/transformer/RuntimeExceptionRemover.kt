package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool
import org.objectweb.asm.Type
import org.tinylog.kotlin.Logger
import java.lang.RuntimeException

class RuntimeExceptionRemover : BytecodeTransformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                val itr = method.tryCatchBlocks.iterator()
                while(itr.hasNext()) {
                    val tcb = itr.next()
                    if(tcb.type == Type.getInternalName(RuntimeException::class.java)) {
                        itr.remove()
                        count++
                    }
                }
            }
        }

        Logger.info("Removed $count RuntimeException try-catch blocks.")
    }
}