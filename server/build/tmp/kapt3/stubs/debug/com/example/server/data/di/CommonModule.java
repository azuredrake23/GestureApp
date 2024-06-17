package com.example.server.data.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/server/data/di/CommonModule;", "", "()V", "provideDatabase", "Lcom/example/server/data/room/MyDatabase;", "context", "Landroid/content/Context;", "provideLogsDao", "Lcom/example/server/data/room/LogsDao;", "appDatabase", "provideLogsRepository", "Lcom/example/server/domain/repositories/LogsRepository;", "logsListDao", "server_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class CommonModule {
    
    public CommonModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.server.data.room.MyDatabase provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.server.data.room.LogsDao provideLogsDao(@org.jetbrains.annotations.NotNull
    com.example.server.data.room.MyDatabase appDatabase) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.server.domain.repositories.LogsRepository provideLogsRepository(@org.jetbrains.annotations.NotNull
    com.example.server.data.room.LogsDao logsListDao) {
        return null;
    }
}