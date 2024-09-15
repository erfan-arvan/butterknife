package butterknife;
import javax.annotation.Nullable;  @UiThread void unbind();

  Unbinder EMPTY = new Unbinder() {
    @Override public void unbind() { }
  };
}
