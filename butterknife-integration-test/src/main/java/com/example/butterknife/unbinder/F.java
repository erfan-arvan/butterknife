package com.example.butterknife.unbinder;
import javax.annotation.Nullable;
public final class F extends D {

  @BindColor(android.R.color.background_light) @ColorInt int backgroundLightColor;

  public F(View view) {
    super(view);
    ButterKnife.bind(this, view);
  }
}
