package XGraphs;

import java.util.*;

public class OConnectingCitiesWithMinimumCost {
  public static void main(String[] args) {
    int n = 3; // number of cities
    int[][] connections = { { 1, 2, 5 }, { 1, 3, 6 }, { 2, 3, 1 } };
    System.out.println(minimumCost(n, connections));
  }

  public static int minimumCost(int n, int[][] connections) {
    List<int[]>[] graph = new ArrayList[n + 1];
    for (int i = 1; i <= n; i++)
      graph[i] = new ArrayList<>();
    for (int[] conn : connections) {
      graph[conn[0]].add(new int[] { conn[1], conn[2] });
      graph[conn[1]].add(new int[] { conn[0], conn[2] });
    }

    boolean[] visited = new boolean[n + 1];
    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
    pq.offer(new int[] { 1, 0 });
    int total = 0, count = 0;

    while (!pq.isEmpty() && count < n) {
      int[] curr = pq.poll();
      int city = curr[0], cost = curr[1];
      if (visited[city])
        continue;
      visited[city] = true;
      total += cost;
      count++;
      for (int[] next : graph[city]) {
        if (!visited[next[0]])
          pq.offer(next);
      }
    }
    return count == n ? total : -1;
  }
}
