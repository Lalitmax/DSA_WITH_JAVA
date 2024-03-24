import java.util.ArrayList;
import java.util.Stack;

public class Strongly_connected_graph_using_kosaraju_algo {
    
    // Inner class representing an edge in the graph
    public static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }
    
    // Method to perform topological sort using DFS
    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            int dest = graph[curr].get(i).dest;

            if (!vis[dest]) {
                topSort(graph, dest, vis, s);
            }
        }
        // Add the current node to the stack after visiting all its neighbors
        s.add(curr);
    }

    // Method to perform DFS on the transpose graph
    public static void dfs(ArrayList<Edge>[] transpose, int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " "); // Print the current node

        for (int i = 0; i < transpose[curr].size(); i++) {
            int dest = transpose[curr].get(i).dest;

            if (!vis[dest]) {
                dfs(transpose, dest, vis);
            }
        }
    }

    // Method to find strongly connected components using Kosaraju's algorithm
    public static void kosaraju(ArrayList<Edge>[] graph, int V) {

        // Step 1: Perform topological sort on the original graph
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        // Step 2: Create transpose of the graph
        ArrayList<Edge>[] transpose = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<>();
        }
        vis = new boolean[V];

        // Create the transpose graph by reversing the direction of edges
        for (int i = 0; i < V; i++) {
            int curr = i;
            for (int j = 0; j < graph[curr].size(); j++) {
                Edge e = graph[curr].get(j);

                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }
        
        // Step 3: Perform DFS on the transpose graph in the order of nodes popped from stack
        while (!s.isEmpty()) {
            int node = s.pop();
            if (!vis[node]) {
                dfs(transpose, node, vis);
                System.out.println();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

        // Calling Kosaraju's algorithm to find strongly connected components
        kosaraju(graph, V);
    }
}
