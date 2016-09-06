package pvt.lint;

import com.android.tools.lint.detector.api.Issue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class IssueRegistry extends com.android.tools.lint.client.api.IssueRegistry {
  @Override public List<Issue> getIssues() {
    return Collections.singletonList(WrongPrivateUsageDetector.ISSUE_ACCESS);
  }
}
