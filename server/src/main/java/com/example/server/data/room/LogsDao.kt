package com.example.server.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.server.data.models.LogsModel
import kotlinx.coroutines.flow.Flow

@Dao
interface LogsDao {

    @Query("SELECT logs FROM config")
    fun getLogs(): Flow<String>

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun addLogs(logs: LogsModel)
}