package com.tutorial.reactive.kotlin.model


data class Transaction(
    val id: Int? = null,
    val details: List<Details>
) : Audit() {
t co
    data class Details(
        val id: Int? = null,
        val item: Item,
        val amount: Int,
        val currentPrice: Double,
        val subTotal: Double
    )

}