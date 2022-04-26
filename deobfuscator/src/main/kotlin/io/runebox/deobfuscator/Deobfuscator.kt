package io.runebox.deobfuscator

import io.runebox.asm.ClassPool
import io.runebox.deobfuscator.transform.ControlFlowFixer
import io.runebox.deobfuscator.transform.OpaquePredicateRemover
import io.runebox.deobfuscator.transform.RuntimeExceptionRemover
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.reflect.full.createInstance

class Deobfuscator(
    private val inputJar: File,
    private val outputJar: File
) {
    lateinit var pool: ClassPool private set
    private val transformers = mutableListOf<Transformer>()

    private fun init() {
        Logger.info("Initializing deobfuscator...")

        pool = ClassPool.readJar(inputJar) { it.name.startsWith("org/") }
        Logger.info("Loaded ${pool.classes().size} classes from input jar.")

        /*
         * Add deobfuscator transformers
         */
        addTransformer<RuntimeExceptionRemover>()
        addTransformer<ControlFlowFixer>()
        addTransformer<OpaquePredicateRemover>()

        Logger.info("Found ${transformers.size} deobfuscator bytecode transformers.")
    }

    fun run() {
        this.init()
        Logger.info("Running deobfuscator...")

        transformers.forEach { transformer ->
            Logger.info("Executing bytecode transformer: ${transformer::class.simpleName}.")
            val startTime = System.currentTimeMillis()
            transformer.execute(pool)
            val deltaTime = System.currentTimeMillis() - startTime
            Logger.info("Finished executing transformer: ${transformer::class.simpleName} in ${deltaTime}ms.")
        }

        Logger.info("Saving deobfuscated classes to output jar.")
        pool.writeJar(outputJar, includeIgnoredClasses = true)

        Logger.info("Completed deobfuscation successfully. Exiting process.")
    }

    private inline fun <reified T : Transformer> addTransformer() {
        val cls = T::class
        val transformer = cls.createInstance()
        this.transformers.add(transformer)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 2) throw IllegalArgumentException("Invalid or missing program arguments. [Usage: deobfuscator.jar <input jar> <output jar>]")
            Deobfuscator(File(args[0]), File(args[1])).run()
        }
    }
}