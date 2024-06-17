package com.example.server.ui.viewModels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/server/ui/viewModels/ServerViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "updateLogsUseCase", "Lcom/example/server/domain/usecase/UpdateLogsUseCase;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/example/server/domain/usecase/UpdateLogsUseCase;)V", "addLogs", "", "logs", "Lcom/example/server/data/models/LogsModel;", "server_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ServerViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.server.domain.usecase.UpdateLogsUseCase updateLogsUseCase = null;
    
    @javax.inject.Inject
    public ServerViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull
    com.example.server.domain.usecase.UpdateLogsUseCase updateLogsUseCase) {
        super();
    }
    
    public final void addLogs(@org.jetbrains.annotations.NotNull
    com.example.server.data.models.LogsModel logs) {
    }
}