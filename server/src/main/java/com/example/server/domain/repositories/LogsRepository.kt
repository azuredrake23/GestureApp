package com.example.server.domain.repositories

import com.example.server.data.models.LogsModel
import kotlinx.coroutines.flow.Flow

interface LogsRepository {

    suspend fun addLogs(logsModel: LogsModel)
}