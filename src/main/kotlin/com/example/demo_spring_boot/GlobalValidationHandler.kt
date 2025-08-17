package com.example.demo_spring_boot

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalValidationHandler {
    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationError(
        ex: MethodArgumentNotValidException
    ): ResponseEntity<Map<String, Any?>> {
        val errors = ex.bindingResult.allErrors.map {
            it.defaultMessage ?: "Invalid Message"
        }
        return ResponseEntity
            .status(400)
            .body(mapOf("errors" to errors))
    }

}