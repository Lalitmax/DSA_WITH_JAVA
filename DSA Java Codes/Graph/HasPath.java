import java.util.ArrayList;

public class HasPath {
    static class Edge {
        int src, dest, wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, boolean visited[], int src, int dest) { // TC=O(V+E)
        if (src == dest)
            return true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            
            visited[src]=true;

        
            
            if (!visited[e.dest]) {
                boolean isPath = hasPath(graph, visited, e.dest, dest);
                if (isPath) {
                    return true;
                }
            }
        }
  
        return false;
    }

    public static void main(String srgs[]) {

        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        int src=0;
        int dest=2;
        System.out.print(hasPath(graph, new boolean[V], src, dest));
    }

}
