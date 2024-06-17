package com.example.server.ui.screens

import androidx.compose.runtime.Composable
import com.example.server.ui.viewModels.ServerViewModel

@Composable
fun App(
    serverViewModel: ServerViewModel
) {
    AppNavigation(
        serverViewModel = serverViewModel
    )
}