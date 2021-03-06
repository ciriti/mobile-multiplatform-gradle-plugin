/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    `kotlin-dsl`
    `maven-publish`
}

group = "dev.icerock"
version = "0.9.0"

repositories {
    jcenter()
    google()
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("com.android.tools.build:gradle:4.1.1")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.20")
    compileOnly("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.4.20")
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

publishing {
    repositories.maven("https://api.bintray.com/maven/icerockdev/plugins/mobile-multiplatform/;publish=1") {
        name = "bintray"

        credentials {
            username = System.getProperty("BINTRAY_USER")
            password = System.getProperty("BINTRAY_KEY")
        }
    }
}
