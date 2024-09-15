package butterknife;
import javax.annotation.Nullable;
/** An action that can be applied to a list of views. */
public interface Action<T extends View> {
  /** Apply the action on the {@code view} which is at {@code index} in the list. */
  @UiThread void apply(@NonNull T view, int index);
}
