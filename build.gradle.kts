import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.31" // Kotlin version
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8")) // Java compatibility
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2") // JUnit 5 support
    testImplementation("io.kotest:kotest-runner-junit5-jvm:4.0.2") // kotest framework
    testImplementation("io.kotest:kotest-assertions-core-jvm:4.0.2") // kotest core jvm assertions
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed") // display test output on console
    }
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "1.8" // JVM level for Kotlin compiler
}