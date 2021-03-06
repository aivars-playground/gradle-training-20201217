/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/6.7.1/samples
 */

plugins{
    java
    id("com.gradleup.static-analysis") version "1.3"
}

version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_15
    targetCompatibility = JavaVersion.VERSION_15
    withSourcesJar() //creates javadoc in hello-groovy-1.0-SNAPSHOT-javadoc.jar in /build/libs
    withJavadocJar() //creates sources in hello-groovy-1.0-SNAPSHOT-sources.jar in /build/libs
}

tasks.register("hello") {
    doFirst {
        println("first hello")
    }
    doLast {
        println("last hello")
    }
}

tasks.register("world") {

    dependsOn("hello")

    doFirst {
        println("first world")
    }
    doLast {
        println("last world")
    }
}
