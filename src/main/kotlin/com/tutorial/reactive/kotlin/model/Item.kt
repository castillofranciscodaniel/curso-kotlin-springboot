package com.tutorial.reactive.kotlin.model

enum class ItemCategory {
    TECHNOLOGY
}

data class Item(
    val id: String? = null,
    val name: String,
    val category: ItemCategory,
    val description: String,
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