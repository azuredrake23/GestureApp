package com.example.server.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "config")
data class LogsModel(
    @PrimaryKey
    @ColumnInfo(name = "logs")
    val logs: String,
)