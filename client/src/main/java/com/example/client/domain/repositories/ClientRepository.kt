package com.example.client.domain.repositories

import com.example.client.data.models.Gestures

interface ClientRepository {

    suspend fun getGestures(ip: String, port: Int): Gestures
}