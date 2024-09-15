package butterknife;
import javax.annotation.Nullable;
import static com.google.common.truth.Truth.assertAbout;
import static com.google.testing.compile.JavaSourceSubjectFactory.javaSource;

public final class BindIntTest {
  @Test public void typeMustBeInt() {
    JavaFileObject source = JavaFileObjects.forSourceString("test.Test", ""
        + "package test;\n"
        + "import butterknife.BindInt;\n"
        + "public class Test {\n"
        + "  @BindInt(1) String one;\n"
        + "}"
    );

    assertAbout(javaSource()).that(source)
        .processedWith(new ButterKnifeProcessor())
        .failsToCompile()
        .withErrorContaining("@BindInt field type must be 'int'. (test.Test.one)")
        .in(source).onLine(4);
  }
}
