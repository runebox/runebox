plugins {
    java
}

dependencies {
    implementation(project(":runebox-api"))
    implementation(project(":runebox-common"))
    implementation(project(":runebox-util"))
    implementation(project(":runebox-logger"))
    implementation(project(":runebox-eventbus"))
    implementation("com.formdev:flatlaf:_")
    implementation("com.formdev:flatlaf-intellij-themes:_")
    implementation("org.bouncycastle:bcprov-jdk15on:1.52")
    implementation("org.json:json:20220320")
}

tasks {
    val shadowJar = create<Jar>("shadowJar") {
        group = "build"
        archiveClassifier.set("shaded")
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        manifest {
            attributes["Main-Class"] = "io.runebox.client.RuneBox"
        }
        from(configurations.runtimeClasspath.get().map {
            if(it.isDirectory) it
            else zipTree(it)
        })
        with(jar.get())
    }

    create<JavaExec>("run") {
        dependsOn(build.get())
        group = "application"
        mainClass.set("io.runebox.client.RuneBox")
        workingDir = project.projectDir
        classpath = sourceSets["main"].runtimeClasspath
    }

    build {
        finalizedBy(shadowJar)
    }

    processResources {
        dependsOn(":runebox-injector:injectGamepack")
        from("${project(":runebox-gamepack").buildDir}/libs/runebox-gamepack.injected.jar")
    }
}