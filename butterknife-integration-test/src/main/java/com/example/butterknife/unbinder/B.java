package com.example.butterknife.unbinder;
import javax.annotation.Nullable;
public class B extends A {

  @BindColor(android.R.color.white) @ColorInt int whiteColor;

  public B(View view) {
    super(view);
    ButterKnife.bind(this, view);
  }
}
