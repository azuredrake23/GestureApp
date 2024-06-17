package com.example.server.domain.repositories;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/server/domain/repositories/LogsRepository;", "", "addLogs", "", "logsModel", "Lcom/example/server/data/models/LogsModel;", "(Lcom/example/server/data/models/LogsModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "server_debug"})
public abstract interface LogsRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addLogs(@org.jetbrains.annotations.NotNull
    com.example.server.data.models.LogsModel logsModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}