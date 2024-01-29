package com.tutorial.reactive.kotlin.repository

import com.tutorial.reactive.kotlin.model.Item
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface ItemRepository: ReactiveCrudRepository<Item, Int> {
}