package de.example.spring_aop_collision

import de.example.spring_aop_collision.customaspect.OnError
import io.micrometer.core.annotation.Timed
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
@Timed
class ExampleController {

    @GetMapping
    @OnError
    fun index() {

    }

}