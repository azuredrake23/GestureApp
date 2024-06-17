package com.example.server.data.di;

import android.content.Context;
import com.example.server.data.room.MyDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class CommonModule_ProvideDatabaseFactory implements Factory<MyDatabase> {
  private final CommonModule module;

  private final Provider<Context> contextProvider;

  public CommonModule_ProvideDatabaseFactory(CommonModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public MyDatabase get() {
    return provideDatabase(module, contextProvider.get());
  }

  public static CommonModule_ProvideDatabaseFactory create(CommonModule module,
      Provider<Context> contextProvider) {
    return new CommonModule_ProvideDatabaseFactory(module, contextProvider);
  }

  public static MyDatabase provideDatabase(CommonModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideDatabase(context));
  }
}
