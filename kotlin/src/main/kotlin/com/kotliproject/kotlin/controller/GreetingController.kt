package com.kotliproject.kotlin.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.kotliproject.kotlin.usecase.Greeting
import org.springframework.web.bind.annotation.RequestParam
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
    val counter: AtomicLong = AtomicLong();

    @RequestMapping("/greeting")
    fun greetinbg(@RequestParam(value="name", defaultValue = "World") name: String): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello, $name")
    }
}