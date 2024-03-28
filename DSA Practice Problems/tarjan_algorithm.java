import java.util.ArrayList;

public class tarjan_algorithm {
    public static class Edge{

        int src,dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;

        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int par,int time, int dt[], int low[], boolean vis[]){
        vis[curr ] = true;
        dt[curr]  = low[curr] = ++time;


        for(int i=0; i<graph[curr].size(); i++){
            int neigh = graph[curr].get(i).dest;

            if(par==neigh){
                continue;
            }else if(!vis[neigh]){
                dfs(graph, neigh, curr, time, dt, low, vis);
                low[curr] = Math.min(low[curr],low[neigh]);

                if(dt[curr]<low[neigh]){
                    System.out.println(curr+"--"+neigh);
                }
            }else{
                low[curr] = Math.min(low[curr],dt[neigh]);
            }
        }
    }
    public static void tarjanBridge(ArrayList<Edge> graph[], int V){
        int dt[] = new int[V];
        int low[] = new int[V];

        boolean vis[] = new boolean[V];
        int time=0;

        for(int i=0; i<V; i++){
            if(!vis[i]){
                dfs(graph, i, -1, time, dt, low, vis);
            }
        }
        

    }
    public static void main(String[] args) {
         int V=6;

        ArrayList<Edge>[]  graph = new ArrayList[V];
        for(int i=0; i<V; i++) graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        tarjanBridge(graph, V);
        
    }
}
