// Generated by Dagger (https://dagger.dev).
package com.example.artgram.repositories;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserRepository_Factory implements Factory<UserRepository> {
  @Override
  public UserRepository get() {
    return newInstance();
  }

  public static UserRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserRepository newInstance() {
    return new UserRepository();
  }

  private static final class InstanceHolder {
    private static final UserRepository_Factory INSTANCE = new UserRepository_Factory();
  }
}
