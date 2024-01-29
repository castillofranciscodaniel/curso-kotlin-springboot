package com.tutorial.reactive.kotlin.model

import org.springframework.data.annotation.Id


data class Transaction(
    @Id val id: String? = null,
    val details: List<Details>
) : Audit() {

    data class Details(
        @Id val id: String? = null,
        val item: Item,
        val amount: Int,
        val currentPrice: Double,
        val subTotal: Double
    )

}