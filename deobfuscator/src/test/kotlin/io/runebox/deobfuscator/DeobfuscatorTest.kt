package io.runebox.deobfuscator

import java.io.File

object DeobfuscatorTest {

    @JvmStatic
    fun main(args: Array<String>) {
        if(args.size != 2) throw IllegalArgumentException("Invalid or missing java arguments.")

        val inputJar = File(args[0])
        val outputJar = File(args[1])
        Deobfuscator(inputJar, outputJar).run()
    }
}