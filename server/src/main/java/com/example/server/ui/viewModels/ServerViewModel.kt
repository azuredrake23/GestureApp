package com.example.server.ui.viewModels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.server.data.models.LogsModel
import com.example.server.domain.usecase.UpdateLogsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ServerViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val updateLogsUseCase: UpdateLogsUseCase
    ): ViewModel(){

    fun addLogs(logs: LogsModel){
        viewModelScope.launch {
            updateLogsUseCase.execute(logs)
        }
    }
}