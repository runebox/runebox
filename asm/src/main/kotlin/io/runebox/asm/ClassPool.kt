package io.runebox.asm

import org.objectweb.asm.ClassReader
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.io.FileOutputStream
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

class ClassPool private constructor() {
    private val classMap = mutableMapOf<String, ClassNode>()
    private val ignoredClassMap = mutableMapOf<String, ClassNode>()

    fun init() {
        classes().forEach { it.init(this) }
    }

    fun addClass(cls: ClassNode) {
        classMap[cls.name] = cls
    }

    fun ignoreClass(cls: ClassNode) {
        if(classMap.containsKey(cls.name)) {
            throw IllegalArgumentException("Can not ignore already loaded class: ${cls.name}.")
        }

        ignoredClassMap[cls.name] = cls
    }

    fun removeClass(cls: ClassNode) {
        classMap.remove(cls.name)
    }

    fun classes() = classMap.values.toList()
    fun ignoredClasses() = ignoredClassMap.values.toList()

    fun getClass(name: String): ClassNode? = classMap[name]

    fun writeJar(jarFile: File, includeIgnoredClasses: Boolean = false) {
        if(jarFile.exists()) {
            jarFile.deleteRecursively()
        }

        val jos = JarOutputStream(FileOutputStream(jarFile))

        classes().forEach { cls ->
            jos.putNextEntry(JarEntry(cls.name.replace(".", "\\") + ".class"))
            jos.write(cls.toByteArray())
            jos.closeEntry()
        }

        if(includeIgnoredClasses) {
            ignoredClasses().forEach { cls ->
                jos.putNextEntry(JarEntry(cls.name.replace(".", "\\") + ".class"))
                jos.write(cls.toByteArray())
                jos.closeEntry()
            }
        }

        jos.close()
    }

    companion object {

        fun readJar(jarFile: File, ignorePredicate: (ClassNode) -> Boolean = { false }): ClassPool {
            val pool = ClassPool()

            JarFile(jarFile).use { jar ->
                jar.entries().asSequence()
                    .filter { it.name.endsWith(".class") }
                    .forEach { entry ->
                        val reader = ClassReader(jar.getInputStream(entry))
                        val cls = ClassNode()
                        reader.accept(cls, ClassReader.SKIP_FRAMES)

                        if(ignorePredicate(cls)) {
                            pool.ignoreClass(cls)
                        } else {
                            pool.addClass(cls)
                        }
                    }
            }

            return pool
        }
    }
}