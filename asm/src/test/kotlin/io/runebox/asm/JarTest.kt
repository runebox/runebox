package io.runebox.asm

import java.io.File

object JarTest {

    private lateinit var pool: ClassPool

    @JvmStatic
    fun main(args: Array<String>) {
        if(args.size != 2) {
            throw IllegalArgumentException("Invalid arguments.")
        }

        println("Loading jar file: ${args[0]}.")

        val jarFile = File(args[0])
        pool = ClassPool.readJar(jarFile) { cls ->
            listOf(
                "org/json",
                "org/bouncycastle"
            ).any { cls.name.startsWith(it) }
        }

        println("Successfully loaded ${pool.classes().size} classes.")

        pool.classes().forEach { cls ->
            println("Class: ${cls.name} : ${cls.superName}")
        }

        println("Writing output classes to jar file: ${args[1]}.")

        val outJarFile = File(args[1])
        pool.writeJar(outJarFile, includeIgnoredClasses = true)

        println("Successfully completed test.")
    }
}