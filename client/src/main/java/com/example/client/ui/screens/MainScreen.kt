package com.example.client.ui.screens

import com.example.client.domain.services.MyAccessibilityService
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
import androidx.lifecycle.compose.LifecycleResumeEffect
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.client.ui.viewModels.ClientViewModel
import com.example.client.utils.Constants
import com.example.client.utils.isAccessibilityServiceEnabled
import kotlinx.coroutines.launch


@Composable
fun MainScreen(
    context: Context,
    clientViewModel: ClientViewModel,
) {
    val dialogState = remember {
        mutableStateOf(false)
    }
    val scope = rememberCoroutineScope()
    if (dialogState.value) {
        ConfigureDialog(
            context = context,
            dialogState = dialogState,
            onClickSave = { ip, port, dataStoreManager ->
                scope.launch {
                    dataStoreManager.saveValue("ip", ip)
                    dataStoreManager.saveValue("port", port)
                }
            })
    }
    MainScreenContent(
        context = context,
        clientViewModel = clientViewModel,
        onClickConfigure = {
            dialogState.value = true
        })
}

@Composable
fun MainScreenContent(
    context: Context,
    clientViewModel: ClientViewModel,
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
        val accessibilityServiceState =
            clientViewModel.accessibilityServiceState.collectAsStateWithLifecycle()
        val settingsActivity = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)

        LifecycleResumeEffect(key1 = accessibilityServiceState) {
            clientViewModel.updateAccessibilityServiceState(
                context,
                isAccessibilityServiceEnabled(
                    context,
                    MyAccessibilityService::class.java
                )
            )
            onPauseOrDispose {
            }
        }

        if (accessibilityServiceState.value) {
            WebView()
        }

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {

            Button(
                onClick = {
                    onClickConfigure.invoke()
                }, modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(20.dp),
                enabled = !accessibilityServiceState.value
            ) {
                Text(text = "Configuration", fontSize = 20.sp)
            }

            Button(
                onClick = {
                    if (accessibilityServiceState.value)
                        clientViewModel.updateAccessibilityServiceState(context, false)
                    else {
                        context.startActivity(settingsActivity)
                    }
                }, modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(20.dp)
            ) {
                Text(
                    text = if (accessibilityServiceState.value) "Pause" else "Start",
                    fontSize = 20.sp
                )
            }
        }
    }
}

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebView() {
    AndroidView(
        modifier = Modifier
            .height(LocalConfiguration.current.screenHeightDp.dp * 3 / 4),
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                webViewClient = WebViewClient()
                settings.loadWithOverviewMode = true
                settings.setSupportZoom(true)
            }
        },
        update = { webView ->
            webView.loadUrl(Constants.GOOGLE_CHROME_URI)
        }
    )
}

