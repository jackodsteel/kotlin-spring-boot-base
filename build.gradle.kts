import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.1.7.RELEASE"
	kotlin("jvm") version "1.3.50"
	kotlin("plugin.spring") version "1.3.50"
	id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

group = "nz.co.jacksteel"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	val kotlinVersion = "1.3.50"
	val kotlinCoroutinesVersion = "1.3.0"
	val springBootVersion = "2.1.7.RELEASE"
	val jacksonVersion = "2.9.9"
	implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
	implementation(kotlin(module ="stdlib-jdk8", version = kotlinVersion))
	implementation(kotlin(module = "reflect", version = kotlinVersion))
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutinesVersion")
	implementation("org.springframework.boot:spring-boot-starter-webflux:$springBootVersion")
	testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}