package com.application.articles.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = 0,
        @get: NotBlank
        val firstname: String,
        @get: NotBlank
        val lastname: String,
        @get: NotBlank
        val description: String? = null
        )

