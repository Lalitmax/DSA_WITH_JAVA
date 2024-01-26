import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Connected_components {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // connected component
    
    public static void dfs(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                dfsUtil(graph,i,visited);
            }
        }

    }
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr , boolean visited[]) {

        System.out.print(curr+" ");
        visited[curr]=true;

        for(int i=0; i<graph[curr].size(); i++){

            Edge e = graph[curr].get(i);

            if(!visited[e.dest]){
                
                dfsUtil(graph,e.dest,visited);
            }

            
        }
    }

    public static void bfs(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                bfsUtil(i, graph,visited);
            }
        }
    }

    public static void bfsUtil(int j, ArrayList<Edge>[] graph, boolean visited[]) {

        Queue<Integer> q = new LinkedList<>();
        q.add(j);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);

                    q.add(e.dest);
                }
            }

        }

    }

    public static void main(String srgs[]) {
        int V = 9;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Edge(0, 1, 1));
        // graph[0].add(new Edge(0, 2, 1));

        // graph[1].add(new Edge(1, 0, 1));
        // graph[1].add(new Edge(1, 3, 1));

        // graph[2].add(new Edge(2, 0, 1));
        // graph[2].add(new Edge(2, 4, 1));

        // graph[3].add(new Edge(3, 1, 1));
        // graph[3].add(new Edge(3, 4, 1));
        // graph[3].add(new Edge(3, 5, 1));

        // graph[4].add(new Edge(4, 2, 1));
        // graph[4].add(new Edge(4, 3, 1));
        // graph[4].add(new Edge(4, 5, 1));

        // graph[5].add(new Edge(5, 3, 1));
        // graph[5].add(new Edge(5, 4, 1));
        // graph[5].add(new Edge(5, 6, 1));

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));

        graph[4].add(new Edge(4,2,1));


        graph[5].add(new Edge(5,6,1));
        graph[5].add(new Edge(5,7,1));

        graph[6].add(new Edge(6,5,1));
        graph[6].add(new Edge(6,8,1));

        graph[7].add(new Edge(7,5,1));

        graph[8].add(new Edge(8,6,1));
        // bfs(graph);
        dfs(graph);

    }
}
