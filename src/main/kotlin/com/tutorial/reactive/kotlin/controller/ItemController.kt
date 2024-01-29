package com.tutorial.reactive.kotlin.controller

import com.tutorial.reactive.kotlin.model.Item
import com.tutorial.reactive.kotlin.service.ItemService
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/items")
class ItemController(val itemService: ItemService) {

    @PostMapping
    fun save(item: Item) = this.itemService.save(item)

    @GetMapping
    fun findAll() = this.itemService.findAll()
}