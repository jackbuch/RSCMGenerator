plugins {
    kotlin("jvm") version "1.9.23"
    application
}

application {
    mainClass.set("MainKt")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.displee:rs-cache-library:7.1.6")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}