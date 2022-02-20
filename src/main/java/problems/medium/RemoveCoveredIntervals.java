package problems.medium;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveCoveredIntervals {
  // https://leetcode.com/problems/remove-covered-intervals/

  public int removeCoveredIntervals(int[][] intervals) {
    Set<Interval> uniqueIntervals = new HashSet<>();
    Arrays.stream(intervals)
        .map(Interval::new)
        .forEach(
            newInterval -> {
              var removeList =
                  uniqueIntervals.stream()
                      .filter(interval -> interval.isCoveredBy(newInterval))
                      .collect(Collectors.toList());
              if (!removeList.isEmpty()
                  || uniqueIntervals.stream().noneMatch(newInterval::isCoveredBy)) {
                removeList.forEach(uniqueIntervals::remove);
                uniqueIntervals.add(newInterval);
              }
            });
    return uniqueIntervals.size();
  }

  private static class Interval {
    private final int leftBound;
    private final int rightBound;

    public Interval(int[] interval) {
      this.leftBound = Math.min(interval[0], interval[1]);
      this.rightBound = Math.max(interval[0], interval[1]);
    }

    public int getLeftBound() {
      return leftBound;
    }

    public int getRightBound() {
      return rightBound;
    }

    public boolean isCoveredBy(Interval y) {
      return y.getLeftBound() <= this.getLeftBound() && this.getRightBound() <= y.getRightBound();
    }
  }
}
