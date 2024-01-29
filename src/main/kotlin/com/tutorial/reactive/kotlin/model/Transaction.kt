package com.tutorial.reactive.kotlin.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime


data class Transaction(
    @Id val id: Int? = null,
    val details: List<Details>,
    override val createdDate: LocalDateTime? = null,
    override val updatedDate: LocalDateTime? = null
) : Audit {

    data class Details(
        @Id val id: Int? = null,
        val item: Item,
        val amount: Int,
        val currentPrice: Double,
        val subTotal: Double
    )

}