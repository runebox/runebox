package io.runebox.deobfuscator

import org.tinylog.kotlin.Logger
import java.applet.Applet
import java.applet.AppletContext
import java.applet.AppletStub
import java.awt.Color
import java.awt.Dimension
import java.awt.GridLayout
import java.io.File
import java.net.URL
import java.net.URLClassLoader
import javax.swing.JFrame

object DeobfuscatorTest {

    @JvmStatic
    fun main(args: Array<String>) {
        if(args.size < 2) throw IllegalArgumentException("Invalid or missing java arguments.")
        val testClientEnabled = args.size == 3 && args[2].endsWith("-test")

        val inputJar = File(args[0])
        val outputJar = File(args[1])
        Deobfuscator(inputJar, outputJar).run()

        if(testClientEnabled) {
            TestClient(outputJar).start()
        }
    }

    private class TestClient(private val gamepackJarFile: File) {
        private val params = mutableMapOf<String, String>()

        fun start() {
            Logger.info("Starting client using gamepack jar: ${gamepackJarFile.path}.")

            /*
             * Download Jagex jav_config parameters.
             */
            URL("http://oldschool1.runescape.com/jav_config.ws").readText(Charsets.UTF_8).split("\n").forEach {
                var line = it
                if(line.startsWith("param=")) {
                    line = line.substring(6)
                }
                val idx = line.indexOf('=')
                if(idx >= 0) {
                    params[line.substring(0, idx)] = line.substring(idx + 1)
                }
            }

            /*
             * Create client applet from gamepack jar file.
             */
            val classloader = URLClassLoader(arrayOf(gamepackJarFile.toURI().toURL()))
            val main = params["initial_class"]!!.replace(".class", "")
            val applet = classloader.loadClass(main).newInstance() as Applet
            applet.background = Color.BLACK
            applet.preferredSize = Dimension(params["applet_minwidth"]!!.toInt(), params["applet_minheight"]!!.toInt())
            applet.size = applet.preferredSize
            applet.layout = null
            applet.setStub(applet.createStub())
            applet.isVisible = true
            applet.init()

            /*
             * Create the client jframe window with the applet.
             */
            val frame = JFrame("RuneBox Deob Test Client")
            frame.layout = GridLayout(1, 0)
            frame.add(applet)
            frame.pack()
            frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            frame.setLocationRelativeTo(null)
            frame.isVisible = true

            Logger.info("Successfully started test client.")
        }

        private fun Applet.createStub(): AppletStub = object : AppletStub {
            override fun getCodeBase(): URL = URL(params["codebase"])
            override fun getDocumentBase(): URL = URL(params["codebase"])
            override fun getParameter(name: String): String? = params[name]
            override fun getAppletContext(): AppletContext? = null
            override fun isActive(): Boolean = true
            override fun appletResize(width: Int, height: Int) { this@createStub.setSize(width, height) }
        }
    }
}