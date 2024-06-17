package com.example.client.ui.screens

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.client.ui.viewModels.ClientViewModel
import com.example.client.utils.DataStoreManager

@Composable
fun ConfigureDialog(
    context: Context,
    dialogState: MutableState<Boolean>,
    onClickSave: (String, String, DataStoreManager) -> Unit
) {
    val dataStoreManager = DataStoreManager(context)
    var ip by remember { mutableStateOf("") }
    var port by remember { mutableStateOf("") }

    LaunchedEffect(key1 = true, block = {
        ip = dataStoreManager.getValue("ip") ?: "0.0.0.0"
        port = dataStoreManager.getValue("port") ?: "8080"
    })

    AlertDialog(
        onDismissRequest = {
            dialogState.value = false
        },
        confirmButton = {
            TextButton(onClick = {
                onClickSave(ip, port, dataStoreManager)
                dialogState.value = false
            }) {
                Text(text = "Save", fontSize = 20.sp)
            }
        },
        dismissButton = {
            TextButton(onClick = {
                dialogState.value = false
            }) {
                Text(text = "Cancel", fontSize = 20.sp)
            }
        },
        title = {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Configuration settings",
                    modifier = Modifier.padding(bottom = 30.dp)
                )
                Text(text = "Ip-address")
                TextField(
                    value = ip,
                    onValueChange = {
                        ip = it
                    })
                Text(text = "Port")
                TextField(
                    value = port,
                    onValueChange = {
                        port = it
                    })
            }
        })
}