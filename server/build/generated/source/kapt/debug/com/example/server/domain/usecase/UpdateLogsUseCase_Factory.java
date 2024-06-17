package com.example.server.domain.usecase;

import com.example.server.domain.repositories.LogsRepository;
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
public final class UpdateLogsUseCase_Factory implements Factory<UpdateLogsUseCase> {
  private final Provider<LogsRepository> logsRepositoryProvider;

  public UpdateLogsUseCase_Factory(Provider<LogsRepository> logsRepositoryProvider) {
    this.logsRepositoryProvider = logsRepositoryProvider;
  }

  @Override
  public UpdateLogsUseCase get() {
    return newInstance(logsRepositoryProvider.get());
  }

  public static UpdateLogsUseCase_Factory create(Provider<LogsRepository> logsRepositoryProvider) {
    return new UpdateLogsUseCase_Factory(logsRepositoryProvider);
  }

  public static UpdateLogsUseCase newInstance(LogsRepository logsRepository) {
    return new UpdateLogsUseCase(logsRepository);
  }
}
