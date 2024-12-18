package de.example.spring_aop_collision

import io.micrometer.core.aop.CountedAspect
import io.micrometer.core.aop.TimedAspect
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MetricConfiguration {

    @Bean
    fun timedAspect(registry: MeterRegistry) = TimedAspect(registry)

    @Bean
    fun countedAspect(registry: MeterRegistry) = CountedAspect(registry)
}