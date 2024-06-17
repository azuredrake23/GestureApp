package com.example.server.data.di;

import com.example.server.data.room.LogsDao;
import com.example.server.domain.repositories.LogsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class CommonModule_ProvideLogsRepositoryFactory implements Factory<LogsRepository> {
  private final CommonModule module;

  private final Provider<LogsDao> logsListDaoProvider;

  public CommonModule_ProvideLogsRepositoryFactory(CommonModule module,
      Provider<LogsDao> logsListDaoProvider) {
    this.module = module;
    this.logsListDaoProvider = logsListDaoProvider;
  }

  @Override
  public LogsRepository get() {
    return provideLogsRepository(module, logsListDaoProvider.get());
  }

  public static CommonModule_ProvideLogsRepositoryFactory create(CommonModule module,
      Provider<LogsDao> logsListDaoProvider) {
    return new CommonModule_ProvideLogsRepositoryFactory(module, logsListDaoProvider);
  }

  public static LogsRepository provideLogsRepository(CommonModule instance, LogsDao logsListDao) {
    return Preconditions.checkNotNullFromProvides(instance.provideLogsRepository(logsListDao));
  }
}
