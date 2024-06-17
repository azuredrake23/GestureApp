package com.example.server.data.di

import android.content.Context
import androidx.room.Room
import com.example.server.data.repositoryImplementation.LogsRepositoryImpl
import com.example.server.data.room.LogsDao
import com.example.server.data.room.MyDatabase
import com.example.server.domain.repositories.LogsRepository
import com.example.server.utils.Constants.CONFIG_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn (SingletonComponent ::class)
class CommonModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): MyDatabase =
        Room.databaseBuilder(context, MyDatabase::class.java, CONFIG_DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()

    @Singleton
    @Provides
    fun provideLogsDao(appDatabase: MyDatabase): LogsDao {
        return appDatabase.logsListDao()
    }

    @Singleton
    @Provides
    fun provideLogsRepository(logsListDao: LogsDao): LogsRepository {
        return LogsRepositoryImpl(logsListDao)
    }
}