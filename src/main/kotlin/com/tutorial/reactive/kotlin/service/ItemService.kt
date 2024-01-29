package com.tutorial.reactive.kotlin.service

import com.tutorial.reactive.kotlin.repository.ItemRepository
import com.tutorial.reactive.kotlin.model.Item
import org.springframework.stereotype.Service

@Service
class ItemService(val itemRepository: ItemRepository) {

    fun save(item: Item) = this.itemRepository.save(item);

    fun findAll() = this.itemRepository.findAll()

}