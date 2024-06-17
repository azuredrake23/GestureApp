package com.example.client.data.models

import androidx.compose.ui.unit.dp
import kotlinx.serialization.Serializable

@Serializable
data class Gestures(
    val swipeUp: Gesture = Gesture(100.0, 100L, Direction.Top),
    val swipeDown: Gesture = Gesture(100.0, 100L, Direction.Bot),
    val longSwipeUp: Gesture = Gesture(200.0, 200L, Direction.Top),
    val longSwipeDown: Gesture = Gesture(200.0, 200L, Direction.Bot)
)