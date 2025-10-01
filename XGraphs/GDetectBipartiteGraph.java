package XGraphs;

import java.util.*;

public class GDetectBipartiteGraph {
  // Function to check if the graph is bipartite using BFS
  public static boolean isBipartite(int[][] graph) {
    int n = graph.length;
    int[] color = new int[n];
    Arrays.fill(color, -1);

    for (int start = 0; start < n; start++) {
      if (color[start] == -1) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        color[start] = 0;

        while (!queue.isEmpty()) {
          int node = queue.poll();
          for (int neighbor : graph[node]) {
            if (color[neighbor] == -1) {
              color[neighbor] = 1 - color[node];
              queue.offer(neighbor);
            } else if (color[neighbor] == color[node]) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    // Example usage:
    // 0---1
    // | |
    // 3---2
    int[][] graph = { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } };
    System.out.println(isBipartite(graph) ? "Bipartite" : "Not Bipartite");
  }
}
