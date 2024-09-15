package butterknife;
import javax.annotation.Nullable;public interface Unbinder {
  @UiThread void unbind();

  Unbinder EMPTY = new Unbinder() {
    @Override public void unbind() { }
  };
}
