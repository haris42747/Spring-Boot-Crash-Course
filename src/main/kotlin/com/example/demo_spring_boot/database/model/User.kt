package com.example.demo_spring_boot.database.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

// hash("hello")-> 23456789oiuytresdcvb

@Document("users")
data class User(
    @Id val id: ObjectId = ObjectId(),
    val email: String,
    val hashedPassword: String
)
