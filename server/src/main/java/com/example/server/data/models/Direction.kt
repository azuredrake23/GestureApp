package com.example.server.data.models

sealed class Direction {
    object Top: Direction()
    object Bot: Direction()
}