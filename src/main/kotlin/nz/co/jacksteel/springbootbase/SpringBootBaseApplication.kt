package nz.co.jacksteel.springbootbase

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootBaseApplication

fun main(args: Array<String>) {
	runApplication<SpringBootBaseApplication>(*args)
}
