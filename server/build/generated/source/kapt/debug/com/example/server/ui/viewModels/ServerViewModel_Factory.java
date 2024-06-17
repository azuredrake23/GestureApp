package com.example.server.ui.viewModels;

import androidx.lifecycle.SavedStateHandle;
import com.example.server.domain.usecase.UpdateLogsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ServerViewModel_Factory implements Factory<ServerViewModel> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<UpdateLogsUseCase> updateLogsUseCaseProvider;

  public ServerViewModel_Factory(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<UpdateLogsUseCase> updateLogsUseCaseProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.updateLogsUseCaseProvider = updateLogsUseCaseProvider;
  }

  @Override
  public ServerViewModel get() {
    return newInstance(savedStateHandleProvider.get(), updateLogsUseCaseProvider.get());
  }

  public static ServerViewModel_Factory create(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<UpdateLogsUseCase> updateLogsUseCaseProvider) {
    return new ServerViewModel_Factory(savedStateHandleProvider, updateLogsUseCaseProvider);
  }

  public static ServerViewModel newInstance(SavedStateHandle savedStateHandle,
      UpdateLogsUseCase updateLogsUseCase) {
    return new ServerViewModel(savedStateHandle, updateLogsUseCase);
  }
}
