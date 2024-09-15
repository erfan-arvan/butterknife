package butterknife;
import javax.annotation.Nullable;import org.junit.Test;

import static com.google.common.truth.Truth.assertAbout;
import static com.google.testing.compile.JavaSourceSubjectFactory.javaSource;

public final class BindDimenTest {
  @Test public void typeMustBeIntOrFloat() {
    JavaFileObject source = JavaFileObjects.forSourceString("test.Test", ""
        + "package test;\n"
        + "import butterknife.BindDimen;\n"
        + "public class Test {\n"
        + "  @BindDimen(1) String one;\n"
        + "}"
    );

    assertAbout(javaSource()).that(source)
        .processedWith(new ButterKnifeProcessor())
        .failsToCompile()
        .withErrorContaining("@BindDimen field type must be 'int' or 'float'. (test.Test.one)")
        .in(source).onLine(4);
  }
}
