package XGraphs;

import java.util.*;

public class CDFS {
    // Edge class to represent a graph edge
    static class Edge {
        int src, dest;
        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    // Build adjacency list from edge list
    static List<List<Integer>> buildGraph(List<Edge> edges, int n) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (Edge e : edges) {
            graph.get(e.src).add(e.dest);
            graph.get(e.dest).add(e.src); // For undirected graph
        }
        return graph;
    }

    // Recursive DFS
    static void dfs(List<List<Integer>> graph, int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int u : graph.get(v)) {
            if (!visited[u]) dfs(graph, u, visited);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Number of vertices
        List<Edge> edges = Arrays.asList(
            new Edge(0, 1),
            new Edge(0, 2),
            new Edge(1, 3),
            new Edge(1, 4)
        );
        List<List<Integer>> graph = buildGraph(edges, n);

        boolean[] visited = new boolean[n];
        System.out.print("DFS traversal starting from node 0: ");
        dfs(graph, 0, visited);
    }
}