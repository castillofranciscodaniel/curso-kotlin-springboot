package com.tutorial.reactive.kotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

enum class ItemCategory {
    TECHNOLOGY
}

@Table("Item")
data class Item(
    @Id val id: Int? = null,
    val name: String,
    val category: ItemCategory,
    val description: String? = null,
    val price: Double 
) : Audit() {

    @Throws(Exception::class)
    fun setName(name: String): Item {
        if (name.isEmpty()) throw Exception("the name should not be empty")

        return this.copy(name = name)
    }

    @Throws(Exception::class)
    fun setDescription(description: String): Item {
        if (description.isEmpty()) throw Exception("the description should not be empty")

        return this.copy(description = description)
    }

}