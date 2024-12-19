package de.example.spring_aop_collision.customaspect

import mu.KotlinLogging
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class ExceptionWrapperAspect {

    private val logger = KotlinLogging.logger {}

    @Around("execution (@de.example.spring_aop_collision.customaspect.OnError * *.*(..))")
    fun handleAndThrowCustomException(proceedingJoinPoint: ProceedingJoinPoint): Any? = try {
        logger.error { "OnError was called!" }
        proceedingJoinPoint.proceed()
    } catch (throwable: Throwable) {
        logger.error { throwable.message }
    }
}