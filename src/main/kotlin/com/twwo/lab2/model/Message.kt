package com.twwo.lab2.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("MESSAGES")
data class Message(
    @Id val id: Int,
    val text: String
    )