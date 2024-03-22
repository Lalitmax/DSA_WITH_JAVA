import java.util.*;
public class Cheapest_flights_within_k_stops
{
    public static class Edge{
        int src,dest,wt;
        
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt=w;
        }
    }
    
    
    public static class Info{
        int v;
        int cost;
        int stops;
        
        public Info(int v, int cost, int stops){
            this.v = v;
            this.cost = cost;
            this.stops= stops;
        }
    }
    
    public static void createGraph(int flightes[][], ArrayList<Edge>[] graph  ){
        
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        
        for(int i=0; i<flightes.length; i++){
            int src=flightes[i][0];
            int dest = flightes[i][1];
            int wt = flightes[i][2];
            
            graph[src].add(new Edge(src,dest,wt));
        }
        
        
        
        
    }
    
    public static void cheapFlights(int n, int flightes[][], int src, int dest, int k){
        
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flightes,graph);
        
        int dist[] = new int[n];
        
        for(int i=0; i<n; i++){
            if(src!=i){
                dist[i]= Integer.MAX_VALUE;
            }
        }
        
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src,0,0));
        
        while(!q.isEmpty()){
            
            Info curr = q.remove();
            
            if(curr.stops>k){
                break;
            }
            
            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                
                if(curr.cost + wt <dist[v] && curr.stops<=k){
                    dist[v] = curr.cost+wt;
                    q.add(new Info(v,curr.cost+wt,curr.stops+1));
                    
                }
            }
        }
        
        System.out.print(dist[dest]);
        
        
        
        
    }
	public static void main(String[] args) {
        int n=4;
        int flightes[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0;
        int dest =3;
        int k=1;
        

        cheapFlights( n,   flightes,   src,   dest,   k);
        
	}
}
