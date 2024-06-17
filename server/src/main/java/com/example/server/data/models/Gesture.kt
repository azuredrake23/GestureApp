package com.example.server.data.models

import androidx.compose.ui.unit.Dp

data class Gesture(val length: Dp, val timeInMillis: Long, val direction: Direction)