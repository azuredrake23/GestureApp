package com.example.client.ui.screens

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.client.ui.viewModels.ClientViewModel
import com.example.client.utils.Routes

@Composable
fun AppNavigation(
    clientViewModel: ClientViewModel
) {
    NavHostNavigation(
        clientViewModel = clientViewModel
    )
}

@Composable
fun NavHostNavigation(
    context: Context = LocalContext.current,
    navController: NavHostController = rememberNavController(),
    clientViewModel: ClientViewModel
) {
    NavHost(navController = navController, startDestination = Routes.MAIN_SCREEN) {
        composable(Routes.MAIN_SCREEN) {
            MainScreen(
                context = context,
                clientViewModel = clientViewModel,
            )
        }
    }
}