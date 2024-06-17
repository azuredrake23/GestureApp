package com.example.server.ui.screens

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.server.ui.viewModels.ServerViewModel
import com.example.server.utils.Routes

@Composable
fun AppNavigation(
    serverViewModel: ServerViewModel
) {
    NavHostNavigation(
        serverViewModel = serverViewModel
    )
}

@Composable
fun NavHostNavigation(
    context: Context = LocalContext.current,
    navController: NavHostController = rememberNavController(),
    serverViewModel: ServerViewModel
) {
    NavHost(navController = navController, startDestination = Routes.MAIN_SCREEN) {
        composable(Routes.MAIN_SCREEN) {
            MainScreen(
                context = context,
                serverViewModel = serverViewModel,
            )
        }
    }
}