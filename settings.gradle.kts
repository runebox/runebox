plugins {
    id("de.fayard.refreshVersions") version "0.40.1"
}

rootProject.name = "runebox"

include(":common")
include(":util")
include(":logger")
include(":asm")
include(":deobfuscator")
