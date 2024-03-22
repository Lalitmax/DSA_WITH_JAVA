import java.util.*;
public class Bellman_ford_algo {
    
    public static class Edge{
        int src,dest,wt;
        
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void bellmanFord(ArrayList<Edge>[] graph, int src){
        
        int dist[] = new int[graph.length];
        
        for(int i=0; i<graph.length; i++){
            if(src!=i){
                dist[i]= Integer.MAX_VALUE;
            }
        }
        
        // O(V)
        for(int i=0; i<graph.length-1; i++){ // TIme Complexity O(V*E)
            for(int j=0; j<graph.length; j++){
                int curr = j;
                
                // for neighber O(E)
                for(int k=0; k<graph[curr].size(); k++){
                    
                    Edge e = graph[curr].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    
                    if(dist[src]!=Integer.MAX_VALUE && dist[u]+wt < dist[v]){
                        dist[v] = dist[u]+wt;
                    }
                }
            }
        }
        
        for(int i=0; i<dist.length; i++){
            System.out.println("0 ->"+i+ "->"+dist[i]);
        }
        
    }
    public static void main(String args[]) {
        
      int V=5;
      ArrayList<Edge>[] graph = new ArrayList[V];
      
      for(int i=0; i<V ; i++){
          graph[i]= new ArrayList<>();
      }
      
      graph[0].add(new Edge(0,1,2));
      
      graph[0].add(new Edge(0,2,4));
      
      graph[1].add(new Edge(1,2,-4));
      
      graph[2].add(new Edge(2,3,2));
      
      graph[3].add(new Edge(3,4,4));
      
      graph[4].add(new Edge(4,1,-1));
      bellmanFord(graph,0);
      
    }
}