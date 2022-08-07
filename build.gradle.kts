plugins {
    val kotlinVersion = "1.7.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.12.1"
}

group = "top.mrxiaom"
version = "0.1.2"

repositories {
    //maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}
