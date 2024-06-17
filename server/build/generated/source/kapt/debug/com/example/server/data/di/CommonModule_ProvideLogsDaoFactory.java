package com.example.server.data.di;

import com.example.server.data.room.LogsDao;
import com.example.server.data.room.MyDatabase;
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
public final class CommonModule_ProvideLogsDaoFactory implements Factory<LogsDao> {
  private final CommonModule module;

  private final Provider<MyDatabase> appDatabaseProvider;

  public CommonModule_ProvideLogsDaoFactory(CommonModule module,
      Provider<MyDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public LogsDao get() {
    return provideLogsDao(module, appDatabaseProvider.get());
  }

  public static CommonModule_ProvideLogsDaoFactory create(CommonModule module,
      Provider<MyDatabase> appDatabaseProvider) {
    return new CommonModule_ProvideLogsDaoFactory(module, appDatabaseProvider);
  }

  public static LogsDao provideLogsDao(CommonModule instance, MyDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideLogsDao(appDatabase));
  }
}
