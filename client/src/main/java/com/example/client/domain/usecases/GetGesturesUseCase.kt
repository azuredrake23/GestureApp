package com.example.client.domain.usecases

import com.example.client.data.models.Gestures
import com.example.client.domain.repositories.ClientRepository
import javax.inject.Inject

class GetGesturesUseCase @Inject constructor(private val clientRep: ClientRepository) {

    suspend fun execute (ip: String, port: Int) = clientRep.getGestures(ip, port)

}