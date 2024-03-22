 
import java.util.*;
public class Prims_algorithm
{
    public static class Edge{
        int src,dest,wt;
        
        public Edge(int src, int dest, int wt){
            this.src=src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        
        
        public Pair(int v,  int cost){
            this.v = v;
             
            this.cost  = cost;
        }
        
        @Override
        
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }
    
    public static void prims(ArrayList<Edge>[] graph){
        
        
        boolean vis[] = new boolean[graph.length];
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
        
        int totalMinimumCost =0;
        
        while(!pq.isEmpty()){
            
            Pair curr = pq.remove();
            
            if(!vis[curr.v]){
                vis[curr.v]=true;
                
                System.out.println(curr.v+"->"+curr.cost);
                totalMinimumCost +=curr.cost;
                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
            
           
        }
         System.out.println("Total Min Cost : "+totalMinimumCost);
        
        
        
        
    }
	public static void main(String[] args) {
	    int V=7;
	    ArrayList<Edge>[] graph = new ArrayList[V];
	    
	    for(int i=0; i<V; i++){
	        graph[i] = new ArrayList<>();
	    }
	    
	    
	   // graph[0].add(new Edge(0,1,10));
	   // graph[0].add(new Edge(0,1,40));
	    
	   // graph[1].add(new Edge(1,0,10));
	   // graph[1].add(new Edge(1,2,10));
	    
	   // graph[2].add(new Edge(2,1,10));
	   // graph[2].add(new Edge(2,3,10));
	    
	   // graph[3].add(new Edge(3,0,40));
	   // graph[3].add(new Edge(3,2,10));
	   // graph[3].add(new Edge(3,4,2));
	    
	    
	   // graph[4].add(new Edge(4,3,2));
	   // graph[4].add(new Edge(4,5,3));
	   // graph[4].add(new Edge(4,6,8));
	    
	   // graph[5].add(new Edge(5,4,3));
	   // graph[5].add(new Edge(5,6,3));
	     
	   // graph[6].add(new Edge(6,4,8));
	   // graph[6].add(new Edge(6,5,3));
	   
	   graph[0].add(new Edge(0,1,10));
	   graph[0].add(new Edge(0,2,15));
	   graph[0].add(new Edge(0,3,30));
	   graph[1].add(new Edge(1,0,10));
	   graph[1].add(new Edge(1,3,40));
	   
	   graph[2].add(new Edge(2,0,15));
	   graph[2].add(new Edge(2,3,50));
	   
	    graph[3].add(new Edge(3,0,30));
	   graph[3].add(new Edge(3,1,40));
	    graph[3].add(new Edge(3,2,50));
	    
	    prims(graph);
	    
	    
		 
	}
}
