package butterknife;
import javax.annotation.Nullable;
import static com.google.common.truth.Truth.assertAbout;
import static com.google.testing.compile.JavaSourceSubjectFactory.javaSource;

public final class BindStringTest {
  @Test public void typeMustBeString() {
    JavaFileObject source = JavaFileObjects.forSourceString("test.Test", ""
        + "package test;\n"
        + "import butterknife.BindString;\n"
        + "public class Test {\n"
        + "  @BindString(1) boolean one;\n"
        + "}"
    );

    assertAbout(javaSource()).that(source)
        .processedWith(new ButterKnifeProcessor())
        .failsToCompile()
        .withErrorContaining("@BindString field type must be 'String'. (test.Test.one)")
        .in(source).onLine(4);
  }
}
