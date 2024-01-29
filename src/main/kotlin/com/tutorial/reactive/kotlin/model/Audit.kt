package com.tutorial.reactive.kotlin.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDate

abstract class Audit(
    @CreatedDate val createdDate: LocalDate? = null,
    @LastModifiedDate val updatedDate: LocalDate? = null
)
