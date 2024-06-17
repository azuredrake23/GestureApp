package com.example.client.data.models

import kotlinx.serialization.Serializable

@Serializable
sealed class Direction {
    data object Top: Direction()
    data object Bot: Direction()
}