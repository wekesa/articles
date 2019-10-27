package com.application.articles.model

import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class Article (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long=0,
        @get: NotBlank
        val title: String,
        @get: NotBlank
        val headline: String,
        @get: NotBlank
        val content: String,
        val addedAt: LocalDateTime = LocalDateTime.now()
        )
