package com.example.server.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.server.data.models.LogsModel
import com.example.server.utils.Constants.CONFIG_DATABASE_NAME

@Database(entities = [(LogsModel::class)], version = 1, exportSchema = false)
abstract class MyDatabase : RoomDatabase() {

    abstract fun logsListDao(): LogsDao

    companion object {
        @Volatile
        private var INSTANCE: MyDatabase? = null

        fun getInstance(context: Context): MyDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MyDatabase::class.java,
                        CONFIG_DATABASE_NAME
                    ).fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}