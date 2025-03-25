plugins {
    kotlin("jvm") version "2.1.10"
    id("com.google.devtools.ksp") version "2.1.10-1.0.31"
    id("eu.vendeli.telegram-bot") version "8.0.0"
}

group = "thatusualguy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.sksamuel.hoplite:hoplite-core:2.9.0")
    implementation("com.sksamuel.hoplite:hoplite-yaml:2.9.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}