package com.example.client.data.models

import androidx.compose.ui.unit.Dp
import kotlinx.serialization.Serializable

@Serializable
data class Gesture(val length: Double, val timeInMillis: Long, val direction: Direction)