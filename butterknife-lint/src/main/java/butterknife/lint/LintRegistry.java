package butterknife.lint;
import javax.annotation.Nullable;import java.util.List;

/**
 * Contains references to all custom lint checks for butterknife.
 */
public class LintRegistry extends IssueRegistry {

  @Override public List<Issue> getIssues() {
    return ImmutableList.of(InvalidR2UsageDetector.ISSUE);
  }

  @Override public int getApi() {
    return ApiKt.CURRENT_API;
  }
}
