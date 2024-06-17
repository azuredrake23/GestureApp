package com.example.client.ui.viewModels

import com.example.client.domain.services.MyAccessibilityService
import android.content.Context
import android.content.Intent
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.client.data.models.Gestures
import com.example.client.domain.usecases.GetGesturesUseCase
import com.example.client.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ClientViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    val accessibilityServiceState: StateFlow<Boolean> =
        savedStateHandle.getStateFlow(Constants.ACCESSIBILITY_SERVICE_STATE, false)

    fun updateAccessibilityServiceState(context: Context, isStarted: Boolean){
        viewModelScope.launch {
            if (!isStarted){
                context.stopService(Intent(context, MyAccessibilityService::class.java))
            }
            savedStateHandle[Constants.ACCESSIBILITY_SERVICE_STATE] = isStarted
        }
    }
}