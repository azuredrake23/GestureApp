package com.example.client.ui.screens

import androidx.compose.runtime.Composable
import com.example.client.ui.viewModels.ClientViewModel

@Composable
fun App(
    clientViewModel: ClientViewModel
) {
    AppNavigation(
        clientViewModel = clientViewModel
    )
}