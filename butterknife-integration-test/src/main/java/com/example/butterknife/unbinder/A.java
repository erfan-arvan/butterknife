package com.example.butterknife.unbinder;
import javax.annotation.Nullable;import butterknife.ButterKnife;

public class A {

  @BindColor(android.R.color.black) @ColorInt int blackColor;

  public A(View view) {
    ButterKnife.bind(this, view);
  }
}
