package com.example.client.data.di

import com.example.client.data.repositoryImplementation.ClientRepositoryImpl
import com.example.client.domain.repositories.ClientRepository
import com.example.client.domain.usecases.GetGesturesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CommonModule {

    @Singleton
    @Provides
    fun provideClientRepository(): ClientRepository {
        return ClientRepositoryImpl()
    }

    @Singleton
    @Provides
    fun provideGetGesturesUseCase(clientRep: ClientRepository): GetGesturesUseCase {
        return GetGesturesUseCase(clientRep)
    }
}