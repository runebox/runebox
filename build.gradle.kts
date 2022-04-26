plugins {
    kotlin("jvm") version "1.6.21"
}

tasks.wrapper {
    gradleVersion = "7.4.2"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "io.runebox"
    version = "0.0.1"

    repositories {
        mavenLocal()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }

    dependencies {
        implementation(kotlin("reflect"))
    }

}