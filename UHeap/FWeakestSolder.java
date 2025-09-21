package UHeap;
import java.util.*;

public class FWeakestSolder {
  static class Row implements Comparable<Row> {
    int soldiers;
    int idx;

    public Row(int soldiers, int idx) {
      this.soldiers = soldiers;
      this.idx = idx;
    }

    @Override
    public int compareTo(Row r2) {
      if (this.soldiers == r2.soldiers) {
        return this.idx - r2.idx;
      } else {
        return this.soldiers - r2.soldiers;
      }
    }
  }

  public static void main(String[] args) {
    int[][] mat = {
      {1,1,0,0,0},
      {1,1,1,1,0},
      {1,0,0,0,0},
      {1,1,0,0,0},
      {1,1,1,1,1}
    };
    int k = 3;
    int[] weakest = kWeakestRows(mat, k);
    System.out.println(Arrays.toString(weakest));
  }

  public static int[] kWeakestRows(int[][] mat, int k) {
    int m = mat.length;
    int n = mat[0].length;
    PriorityQueue<Row> pq = new PriorityQueue<>();
    for (int i = 0; i < m; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 1) count++;
        else break;
      }
      pq.offer(new Row(count, i));
    }
    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
      res[i] = pq.poll().idx;
    }
    return res;
  }
}