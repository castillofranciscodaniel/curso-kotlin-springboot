package com.tutorial.reactive.kotlin.controller

import com.tutorial.reactive.kotlin.service.ItemService
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController(val itemService: ItemService) {
}