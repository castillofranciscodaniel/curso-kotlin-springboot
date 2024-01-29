package com.tutorial.reactive.kotlin.service

import com.tutorial.reactive.kotlin.repository.ItemRepository
import org.springframework.stereotype.Service

@Service
class ItemService(val itemRepository: ItemRepository) {
}