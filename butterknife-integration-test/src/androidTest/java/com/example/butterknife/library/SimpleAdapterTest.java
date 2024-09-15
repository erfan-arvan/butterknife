package com.example.butterknife.library;
import javax.annotation.Nullable;import org.junit.Test;

import static com.example.butterknife.library.SimpleAdapter.ViewHolder;
import static com.google.common.truth.Truth.assertThat;

public class SimpleAdapterTest {
  @Test public void verifyViewHolderViews() {
    Context context = InstrumentationRegistry.getTargetContext();

    View root = View.inflate(context, R.layout.simple_list_item, null);
    ViewHolder holder = new ViewHolder(root);

    assertThat(holder.word.getId()).isEqualTo(R.id.word);
    assertThat(holder.length.getId()).isEqualTo(R.id.length);
    assertThat(holder.position.getId()).isEqualTo(R.id.position);
  }
}
