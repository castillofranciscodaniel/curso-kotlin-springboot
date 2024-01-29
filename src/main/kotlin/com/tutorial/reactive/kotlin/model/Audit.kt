package com.tutorial.reactive.kotlin.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing
import java.time.LocalDate
import java.time.LocalDateTime

interface  Audit {
    @get:CreatedDate
    val createdDate: LocalDateTime?

    @get:LastModifiedDate
    val updatedDate: LocalDateTime?
}

