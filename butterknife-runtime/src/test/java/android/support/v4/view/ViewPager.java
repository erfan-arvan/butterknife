package android.support.v4.view;
import javax.annotation.Nullable;  void removeOnPageChangeListener(OnPageChangeListener listener);

  interface OnPageChangeListener {
    void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

    void onPageSelected(int position);

    void onPageScrollStateChanged(int state);
  }
}
