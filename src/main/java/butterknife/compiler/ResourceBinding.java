package butterknife.compiler;
import javax.annotation.Nullable;
import com.squareup.javapoet.CodeBlock;

interface ResourceBinding {

    Id id();

    /**
     * True if the code for this binding requires a 'res' variable for {@code Resources} access.
     */
    boolean requiresResources(@Nullable int sdk);

    CodeBlock render(@Nullable int sdk);
}
