import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
    id ("java")
    id ("jacoco")

}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // testImplementation(kotlin("test"))
    /*implementation 'org.jetbrains.kotlin:kotlin-stdlib'
    testImplementation 'junit:junit:4.13.2'*/
    implementation ("org.jetbrains.kotlin:kotlin-stdlib")
    testImplementation ("junit:junit:4.13.2")
}

/* // Вот это сказали удалить, иначе тесты не компилились. Откуда этот кусок кода взялся и зачем?
tasks.test {
    useJUnitPlatform()
}*/

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}