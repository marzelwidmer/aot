package ch.keepclam.aot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AotApplication

fun main(args: Array<String>) {
	runApplication<AotApplication>(*args)
}
