group = "io.github.davidmerrick.kotlin_1_7_sandbox"

repositories {
    mavenCentral()
    mavenLocal()
}

plugins {
    kotlin("jvm") version "1.7.20"
    kotlin("kapt") version "1.7.20"
}

dependencies {

    testImplementation("org.spekframework.spek2:spek-runner-junit5:2.0.18")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
            languageVersion = "1.8"
        }
    }

    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "11"
            languageVersion = "1.8"
        }
    }

    test {
        useJUnitPlatform()
    }
}
