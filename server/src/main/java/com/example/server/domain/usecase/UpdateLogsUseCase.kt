package com.example.server.domain.usecase

import com.example.server.data.models.LogsModel
import com.example.server.domain.repositories.LogsRepository
import javax.inject.Inject

class UpdateLogsUseCase @Inject constructor(private val logsRepository: LogsRepository) {

    suspend fun execute(logs: LogsModel){
        logsRepository.addLogs(logs)
    }
}