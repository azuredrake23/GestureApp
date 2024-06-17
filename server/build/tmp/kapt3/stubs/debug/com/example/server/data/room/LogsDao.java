package com.example.server.data.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/server/data/room/LogsDao;", "", "addLogs", "", "logs", "Lcom/example/server/data/models/LogsModel;", "(Lcom/example/server/data/models/LogsModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLogs", "Lkotlinx/coroutines/flow/Flow;", "", "server_debug"})
@androidx.room.Dao
public abstract interface LogsDao {
    
    @androidx.room.Query(value = "SELECT logs FROM config")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> getLogs();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addLogs(@org.jetbrains.annotations.NotNull
    com.example.server.data.models.LogsModel logs, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}