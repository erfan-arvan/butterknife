package butterknife.compiler;
import javax.annotation.Nullable;  Id id();

  /** True if the code for this binding requires a 'res' variable for {@code Resources} access. */
  boolean requiresResources(int sdk);

  CodeBlock render(int sdk);
}
