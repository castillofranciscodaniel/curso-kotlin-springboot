package com.tutorial.reactive.kotlin.model

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestModel {

    @Test
    fun test_1() {

        val itemOne = Item(
            name = "computer",
            category = ItemCategory.TECHNOLOGY,
            description = "description one",
            price = 22.0
        )

        val itemTwo = Item(
            name = "computer",
            category = ItemCategory.TECHNOLOGY,
            description = "description one",
            price = 22.0
        )

        Assertions.assertEquals(itemOne, itemTwo)
    }

    @Test
    fun test_2() {

        val itemOne = Item(
            name = "computer",
            category = ItemCategory.TECHNOLOGY,
            description = "description one",
            price = 22.0
        )

        val itemTwo = Item(
            name = "mouse",
            category = ItemCategory.TECHNOLOGY,
            description = "description two",
            price = 22.0
        )

        Assertions.assertEquals(
            itemOne,
            itemTwo.setName("computer")
                .setDescription("description one")
        )
    }

    @Test
    fun test_3() {

        val itemOne = Item(
            name = "computer",
            category = ItemCategory.TECHNOLOGY,
            description = "description one",
            price = 22.0
        )

        Assertions.assertThrows(
            Exception::class.java,
            { itemOne.setName("computer").setDescription("") },
            "the description should not be empty"
        )
    }

    @Test
    fun transaction_1() {

        val item = Item(
            name = "memory 64gb",
            category = ItemCategory.TECHNOLOGY,
            description = "memory for notebook",
            price = 22.0
        )

        val amount = 2

        val transaction = Transaction(
            details = listOf(
                Transaction.Details(
                    item = item,
                    amount = amount,
                    currentPrice = item.price,
                    subTotal = item.price * amount
                )
            )
        )
    }


}