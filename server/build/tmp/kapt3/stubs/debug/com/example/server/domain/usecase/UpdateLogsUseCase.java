package com.example.server.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/server/domain/usecase/UpdateLogsUseCase;", "", "logsRepository", "Lcom/example/server/domain/repositories/LogsRepository;", "(Lcom/example/server/domain/repositories/LogsRepository;)V", "execute", "", "logs", "Lcom/example/server/data/models/LogsModel;", "(Lcom/example/server/data/models/LogsModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "server_debug"})
public final class UpdateLogsUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.server.domain.repositories.LogsRepository logsRepository = null;
    
    @javax.inject.Inject
    public UpdateLogsUseCase(@org.jetbrains.annotations.NotNull
    com.example.server.domain.repositories.LogsRepository logsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull
    com.example.server.data.models.LogsModel logs, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}