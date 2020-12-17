import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/6.7.1/samples
 */

plugins{
    application
    kotlin("jvm") version "1.3.31"
}

version = "1.0-SNAPSHOT"

application {
    mainClassName = "com.example.Main"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

repositories {
    mavenCentral()
}

val compileKotlin: KotlinCompile by tasks

val compileTestKotlin: KotlinCompile by tasks
