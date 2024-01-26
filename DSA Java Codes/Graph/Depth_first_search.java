import java.util.*;

public class Depth_first_search {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src= src;
            this.dest = dest;
            this.wt   = wt;
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[] ) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {

                dfs(graph, e.dest, vis);

            }
        }
    }

    public static void main(String srgs[]) {
        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(2,2,1));
        graph[4].add(new Edge(2,5,1));

        graph[5].add(new Edge(2,3,1));
        graph[5].add(new Edge(2,4,1));
        graph[5].add(new Edge(2,6,1));
 

        dfs(graph,0, new boolean[V]);

    }

}
