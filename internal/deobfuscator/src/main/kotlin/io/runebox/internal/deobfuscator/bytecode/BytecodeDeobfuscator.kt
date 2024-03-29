package io.runebox.internal.deobfuscator.bytecode

import io.runebox.internal.deobfuscator.TestClient
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool
import io.runebox.internal.deobfuscator.bytecode.asm.ignored
import io.runebox.internal.deobfuscator.bytecode.transformer.*
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.reflect.full.createInstance

class BytecodeDeobfuscator(
    private val inputJar: File,
    private val outputJar: File,
    private val runTestClient: Boolean = false
) {

    private val pool = ClassPool()
    private val bytecodeTransformers = mutableListOf<BytecodeTransformer>()

    private fun registerTransformers() {
        bytecodeTransformers.clear()

        /**
         * Register bytecode deob transformers in the order they will run.
         */
        register<StaticFieldMover>()
        register<RuntimeExceptionRemover>()
        register<DeadCodeRemover>()
        register<IllegalStateExceptionRemover>()
        register<ControlFlowNormalizer>()
        register<RedundantGotoRemover>()
        register<StaticMethodMover>()
        register<UnusedFieldRemover>()
        register<UnusedMethodRemover>()
        register<UniqueRenamer>()
        register<UnusedArgRemover>()
        register<ErrorConstructorRemover>()
        register<VariableExprFixer>()
        register<MultiplierRemover>()
        register<ExprOrderNormalizer>()
        register<GetPathErrorFixer>()
        register<FieldSorter>()
        register<MethodSorter>()
        register<CopyPropagatationFixer>()
        register<ConstantArgumentRemover>()
        register<CounterRemover>()
        register<OverrideAnnotationAdder>()
        register<DeadCodeRemover>()
        register<EmptyClassRemover>()

        Logger.info("Registered ${bytecodeTransformers.size} bytecode transformers.")
    }

    private fun init() {
        Logger.info("Initializing deobfuscator.")

        pool.clear()
        registerTransformers()

        Logger.info("Loading classes from input jar: ${inputJar.name}.")
        pool.readJar(inputJar)
        pool.init()
        pool.classes.filter { it.name.startsWith("org/") }.forEach { it.ignored = true }
        Logger.info("Loaded ${pool.classes.size} classes from jar.")
    }

    fun run() {
        this.init()

        Logger.info("Running bytecode transformers.")
        bytecodeTransformers.forEach { transformer ->
            Logger.info("Running ${transformer::class.simpleName}.")
            transformer.run(pool)
        }
        Logger.info("Completed all bytecode transforms.")

        Logger.info("Saving deobfuscated classes to output jar: ${outputJar.path}.")
        pool.writeJar(outputJar)
        Logger.info("Saved ${pool.classes.size} classes to jar.")

        if(runTestClient) {
            Logger.info("Starting test client using output jar file.")
            TestClient(outputJar, inputJar).start()
        }

        Logger.info("Deobfuscator completed successfully.")
    }

    @DslMarker
    private annotation class RegisterDsl

    @RegisterDsl
    private inline fun <reified T : BytecodeTransformer> register() {
        bytecodeTransformers.add(T::class.createInstance())
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size < 2) error("Usage: <input-jar> <output-jar> [-t]")

            val inputJar = File(args[0])
            val outputJar = File(args[1])
            val runTestClient = (args.size == 3 && args[2] == "-t")

            BytecodeDeobfuscator(inputJar, outputJar, runTestClient).run()
        }
    }
}