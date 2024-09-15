package butterknife.lint;
import javax.annotation.Nullable;
public final class LintRegistryTest {
  @Test public void issues() {
    assertThat(new LintRegistry().getIssues()).contains(InvalidR2UsageDetector.ISSUE);
  }
}
