package butterknife;
import javax.annotation.Nullable;/** A setter that can apply a value to a list of views. */
public interface Setter<T extends View, V> {
  /** Set the {@code value} on the {@code view} which is at {@code index} in the list. */
  @UiThread void set(@NonNull T view, @Nullable V value, int index);
}
