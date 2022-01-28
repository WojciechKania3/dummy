package com.twwo.lab2.controllers

import com.twwo.lab2.model.*
import com.twwo.lab2.services.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource(val messageService: MessageService) {
    @GetMapping
    fun index(): List<Message> = messageService.getAllMessages()
    @PostMapping
    fun post(@RequestBody message: Message) { 
        println("Having fun!")
        messageService.saveMessage(message) 
    }
}