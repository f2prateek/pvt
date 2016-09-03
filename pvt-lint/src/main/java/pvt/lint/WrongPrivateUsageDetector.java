package pvt.lint;

import com.android.tools.lint.detector.api.Category;
import com.android.tools.lint.detector.api.Detector;
import com.android.tools.lint.detector.api.Implementation;
import com.android.tools.lint.detector.api.Issue;
import com.android.tools.lint.detector.api.Scope;
import com.android.tools.lint.detector.api.Severity;
import java.util.EnumSet;

public final class WrongPrivateUsageDetector extends Detector {
  public static final Issue ISSUE_ACCESS =
      Issue.create("PrivateAccessed", "@Private field/method accessed outside class",
          "todo: explanation.", Category.MESSAGES, 5, Severity.WARNING,
          new Implementation(WrongPrivateUsageDetector.class, EnumSet.of(Scope.ALL_JAVA_FILES)));

  public WrongPrivateUsageDetector() {
  }
}
