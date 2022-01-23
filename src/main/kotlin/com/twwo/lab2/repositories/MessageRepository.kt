package com.twwo.lab2.repositories

import com.twwo.lab2.model.Message
import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository: CrudRepository<Message, Int> {
    @Modifying @Query("insert into messages (id, text) values (:messageId, :messageText)")
    fun insertMessage(messageId: Int, messageText: String)
}