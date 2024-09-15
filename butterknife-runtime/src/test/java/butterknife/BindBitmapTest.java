package butterknife;
import javax.annotation.Nullable;
import static com.google.common.truth.Truth.assertAbout;
import static com.google.testing.compile.JavaSourceSubjectFactory.javaSource;

public final class BindBitmapTest {
  @Test public void typeMustBeBitmap() {
    JavaFileObject source = JavaFileObjects.forSourceString("test.Test", ""
        + "package test;\n"
        + "import butterknife.BindBitmap;\n"
        + "public class Test {\n"
        + "  @BindBitmap(1) String one;\n"
        + "}"
    );

    assertAbout(javaSource()).that(source)
        .processedWith(new ButterKnifeProcessor())
        .failsToCompile()
        .withErrorContaining("@BindBitmap field type must be 'Bitmap'. (test.Test.one)")
        .in(source).onLine(4);
  }
}
