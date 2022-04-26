package io.runebox.deobfuscator.transform

import io.runebox.asm.ClassPool
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Type
import org.objectweb.asm.tree.TryCatchBlockNode
import org.tinylog.kotlin.Logger
import java.lang.RuntimeException

class RuntimeExceptionRemover : Transformer {

    private var removed = 0

    override fun execute(pool: ClassPool) {
        var foundEntryPoint = false

        pool.classes().forEach classLoop@ { cls ->
            cls.methods.forEach methodLoop@ { method ->
                if(method.instructions == null || method.instructions.size() == 0) {
                    return@methodLoop
                }

                if(cls.name == "client" && method.name == "init") {
                    foundEntryPoint = true
                    return@methodLoop
                }

                val toRemove = mutableListOf<TryCatchBlockNode>()

                method.tryCatchBlocks.forEach { tryCatch ->
                    if(tryCatch.type == Type.getInternalName(RuntimeException::class.java)) {
                        toRemove.add(tryCatch)
                    }
                }

                method.tryCatchBlocks.removeAll(toRemove)
                removed += toRemove.size
            }
        }

        if(!foundEntryPoint) {
            throw IllegalStateException("Failed to find the client applet 'init()V' entrypoint.")
        }

        Logger.info("Removed $removed 'RuntimeException' try-catch blocks.")
    }
}