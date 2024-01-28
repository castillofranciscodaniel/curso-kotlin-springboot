package com.tutorial.reactive.kotlin.model

import java.time.LocalDate

abstract class Audit(
    val createdDate: LocalDate? = null,
    val updatedDate: LocalDate? = null
)
