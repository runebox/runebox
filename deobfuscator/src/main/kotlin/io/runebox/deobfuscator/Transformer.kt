package io.runebox.deobfuscator

import io.runebox.asm.ClassPool

interface Transformer {

    fun execute(pool: ClassPool)

}