package com.example.server.data.repositoryImplementation

import com.example.server.data.models.LogsModel
import com.example.server.data.room.LogsDao
import com.example.server.domain.repositories.LogsRepository

class LogsRepositoryImpl (private val configDao: LogsDao): LogsRepository {

    override suspend fun addLogs(logsModel: LogsModel) {
        configDao.addLogs(logsModel)
    }


}