import info.solidsoft.gradle.pitest.PitestPluginExtension

plugins {
    id("java")
    id("info.solidsoft.pitest") version "1.15.0"
    id("jacoco")
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.pitest:pitest-junit5-plugin:1.2.1")
    implementation("org.pitest:pitest-maven:1.17.1")
    testImplementation("org.junit.platform:junit-platform-launcher:1.10.0")
    testImplementation ("junit:junit:4.13.2")

}

configure<PitestPluginExtension> {
    verbose = true
    mutators.set(setOf("STRONGER"))
    targetClasses.set(setOf("org.example.*"))
    targetTests.set(setOf("org.example.*"))
    threads.set(Runtime.getRuntime().availableProcessors())
    outputFormats.set(setOf("XML", "HTML"))
}

tasks.named("check") {
    dependsOn(":jacocoTestReport")
}

