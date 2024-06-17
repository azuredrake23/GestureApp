package com.example.client.data.repositoryImplementation

import com.example.client.data.models.Gestures
import com.example.client.domain.repositories.ClientRepository
import io.ktor.client.HttpClient
import io.ktor.client.features.websocket.webSocket
import io.ktor.http.cio.websocket.Frame
import kotlinx.coroutines.channels.consumeEach

class ClientRepositoryImpl : ClientRepository {

    override suspend fun getGestures(ip: String, port: Int): Gestures {
        val client = HttpClient()
        client.webSocket("ws://${ip}:${port}") {
            send(Frame.Text("I'm already at Google Chrome, send gesture parameters!"))
            incoming.consumeEach { element ->

            }
        }
        return Gestures()
    }
}