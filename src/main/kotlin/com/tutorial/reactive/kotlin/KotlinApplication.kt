package com.tutorial.reactive.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.tutorial.reactive.kotlin.repository"])
class KotlinApplication
fun main(args: Array<String>) {
	runApplication<KotlinApplication>(*args)
}
//"com.tutorial.reactive.kotlin"