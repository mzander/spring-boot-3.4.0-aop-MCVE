package de.example.spring_aop_collision

import io.micrometer.core.annotation.Counted
import io.micrometer.core.annotation.Timed
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
@Timed
class ExampleController {

    @GetMapping
    @Counted
    fun index() {

    }

}