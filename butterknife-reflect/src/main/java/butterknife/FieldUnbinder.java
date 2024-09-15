package butterknife;
import javax.annotation.Nullable;
final class FieldUnbinder implements Unbinder {
  private final Object target;
  private final Field field;

  FieldUnbinder(Object target, Field field) {
    this.target = target;
    this.field = field;
  }

  @Override public void unbind() {
    trySet(field, target, null);
  }
}
