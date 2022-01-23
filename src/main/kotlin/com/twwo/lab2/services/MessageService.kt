package com.twwo.lab2.services

import com.twwo.lab2.model.Message
import com.twwo.lab2.repositories.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val repository: MessageRepository) {
    fun getAllMessages(): List<Message> = repository.findAll().toList()
    fun saveMessage(message: Message) {
        if (repository.existsById(message.id)) repository.save(message)
        else repository.insertMessage(message.id, message.text)
    }
}