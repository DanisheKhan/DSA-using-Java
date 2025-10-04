//IMP

package XGraphs;

import java.util.*;

public class NCheapestFlightsWithinKStops {
  public static void main(String[] args) {
    int n = 4;
    int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 3, 100 }, { 0, 2, 500 } };
    int src = 0, dst = 3, k = 1;
    int cost = findCheapestPrice(n, flights, src, dst, k);
    System.out.println("Cheapest Price: " + cost);
  }

  public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    Map<Integer, List<int[]>> graph = new HashMap<>();
    for (int[] flight : flights) {
      graph.computeIfAbsent(flight[0], x -> new ArrayList<>()).add(new int[] { flight[1], flight[2] });
    }

    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] { src, 0, 0 }); // node, cost, stops

    int[] minCost = new int[n];
    Arrays.fill(minCost, Integer.MAX_VALUE);
    minCost[src] = 0;

    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      int node = curr[0], cost = curr[1], stops = curr[2];

      if (stops > k)
        continue;

      List<int[]> neighbors = graph.getOrDefault(node, new ArrayList<>());
      for (int[] neighbor : neighbors) {
        int next = neighbor[0], price = neighbor[1];
        if (cost + price < minCost[next]) {
          minCost[next] = cost + price;
          queue.offer(new int[] { next, cost + price, stops + 1 });
        }
      }
    }

    return minCost[dst] == Integer.MAX_VALUE ? -1 : minCost[dst];
  }
}
