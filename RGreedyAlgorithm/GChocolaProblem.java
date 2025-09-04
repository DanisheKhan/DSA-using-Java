package RGreedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class GChocolaProblem {
  public static void main(String[] args) {
    Integer[] costVertical = { 2, 1, 3, 1, 4 };
    Integer[] costHorizontal = { 4, 1, 2 };

    Arrays.sort(costVertical, Collections.reverseOrder());
    Arrays.sort(costHorizontal, Collections.reverseOrder());

    int v = 0, h = 0;
    int vp = 1, hp = 1;
    int totalCost = 0;

    while (v < costVertical.length && h < costHorizontal.length) {
      if (costVertical[v] >= costHorizontal[h]) {
        totalCost += costVertical[v] * hp;
        vp++;
        v++;
      } else {
        totalCost += costHorizontal[h] * vp;
        hp++;
        h++;
      }
    }

    while (v < costVertical.length) {
      totalCost += costVertical[v] * hp;
      v++;
    }
    while (h < costHorizontal.length) {
      totalCost += costHorizontal[h] * vp;
      h++;
    }

    System.out.println("Minimum cost to cut the chocolate: " + totalCost);
  }
}
