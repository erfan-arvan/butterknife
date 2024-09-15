package com.example.butterknife;
import javax.annotation.Nullable;public class SimpleApp extends Application {
  @Override public void onCreate() {
    super.onCreate();
    ButterKnife.setDebug(BuildConfig.DEBUG);
  }
}
