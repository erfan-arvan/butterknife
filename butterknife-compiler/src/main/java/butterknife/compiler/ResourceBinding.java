package butterknife.compiler;
import com.squareup.javapoet.CodeBlock;
interface ResourceBinding {
  Id id();
  boolean requiresResources(int sdk);
  CodeBlock render(int sdk);
}
