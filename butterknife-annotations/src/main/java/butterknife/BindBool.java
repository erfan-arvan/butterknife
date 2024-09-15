package butterknife;
import javax.annotation.Nullable;import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Bind a field to the specified boolean resource ID.
 * <pre><code>
 * {@literal @}BindBool(R.bool.is_tablet) boolean isTablet;
 * </code></pre>
 */
@Target(FIELD)
@Retention(RUNTIME)
public @interface BindBool {
  /** Boolean resource ID to which the field will be bound. */
  @BoolRes int value();
}
