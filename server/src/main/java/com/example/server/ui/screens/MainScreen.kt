package com.example.server.ui.screens

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.server.ui.viewModels.ServerViewModel
import kotlinx.coroutines.launch


@Composable
fun MainScreen(
    context: Context,
    serverViewModel: ServerViewModel,
) {
    val dialogState = remember {
        mutableStateOf(false)
    }
    val scope = rememberCoroutineScope()
    if (dialogState.value) {
        ConfigureDialog(
            context = context,
            dialogState = dialogState,
            onClickSave = { port, dataStoreManager ->
                scope.launch {
                    dataStoreManager.saveValue("port", port)
                }
            })
    }
    MainScreenContent(
        context = context,
        dialogState = dialogState,
        onClickConfigure = {
            dialogState.value = true
        })
}

@Composable
fun MainScreenContent(
    context: Context,
    dialogState: State<Boolean>,
    onClickConfigure: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Gray),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Button(
            onClick = {
                onClickConfigure.invoke()
            }, modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(20.dp),
            enabled = !dialogState.value
        ) {
            Text(text = "Configuration", fontSize = 20.sp)
        }

//        Button(
//            onClick = {
//                if (accessibilityServiceState.value)
//                    clientViewModel.updateAccessibilityServiceState(context, false)
//                else {
//                    context.startActivity(settingsActivity)
//                }
//            }, modifier = Modifier
//                .fillMaxWidth()
//                .height(100.dp)
//                .padding(20.dp)
//        ) {
//            Text(
//                text = if (accessibilityServiceState.value) "Pause" else "Start",
//                fontSize = 20.sp
//            )
//        }
    }
}

