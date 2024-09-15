package butterknife.functional;
import javax.annotation.Nullable;import butterknife.runtime.test.R;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public final class BindStringTest {
  private final Context context = InstrumentationRegistry.getContext();

  static class Target {
    @BindString(R.string.hey) String actual;
  }

  @Test public void simpleInt() {
    Target target = new Target();
    String expected = context.getString(R.string.hey);

    Unbinder unbinder = new BindStringTest$Target_ViewBinding(target, context);
    assertThat(target.actual).isEqualTo(expected);

    unbinder.unbind();
    assertThat(target.actual).isEqualTo(expected);
  }
}
