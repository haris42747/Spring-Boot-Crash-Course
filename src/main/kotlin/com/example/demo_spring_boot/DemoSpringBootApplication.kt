package com.example.demo_spring_boot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoSpringBootApplication

fun main(args: Array<String>) {
	runApplication<DemoSpringBootApplication>(*args)
}
