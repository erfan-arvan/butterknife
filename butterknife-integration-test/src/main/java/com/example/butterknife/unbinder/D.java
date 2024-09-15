package com.example.butterknife.unbinder;
import javax.annotation.Nullable;
public class D extends C {

  @BindColor(android.R.color.darker_gray) @ColorInt int grayColor;

  public D(View view) {
    super(view);
    ButterKnife.bind(this, view);
  }
}
