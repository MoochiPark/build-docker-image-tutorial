package com.example.builddockerimagetutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
@RestController
class Application {
    @RequestMapping("/")
    fun home(): String = "Hello Docker World"
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
