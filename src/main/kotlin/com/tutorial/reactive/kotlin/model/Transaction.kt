package com.tutorial.reactive.kotlin.model


data class Transaction(
    val id: String? = null,
    val details: List<Details>
) : Audit() {

    data class Details(
        val id: String? = null,
        val item: Item,
        val amount: Int,
        val currentPrice: Double,
        val subTotal: Double
    )

}