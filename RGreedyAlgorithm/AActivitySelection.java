package RGreedyAlgorithm;
//! this is very import question 
import java.util.*;

public class AActivitySelection {
  public static void main(String[] args) {
    int[] start = {1, 3, 0, 5, 8, 5};
    int[] end =   {2, 4, 6, 7, 9, 9};

    // Pair each activity with its start and end time
    int n = start.length;
    int[][] activities = new int[n][3];
    for (int i = 0; i < n; i++) {
      activities[i][0] = i;        // index
      activities[i][1] = start[i]; // start time
      activities[i][2] = end[i];   // end time
    }

    // Sort activities by end time
    Arrays.sort(activities, Comparator.comparingInt(a -> a[2]));

    ArrayList<Integer> selected = new ArrayList<>();
    int lastEnd = activities[0][2];
    selected.add(activities[0][0]);

    for (int i = 1; i < n; i++) {
      if (activities[i][1] >= lastEnd) {
        selected.add(activities[i][0]);
        lastEnd = activities[i][2];
      }
    }

    System.out.println("Max activities = " + selected.size());
    for (int idx : selected) {
      System.out.print("A" + idx + " ");
    }
    System.out.println();
  }
}
