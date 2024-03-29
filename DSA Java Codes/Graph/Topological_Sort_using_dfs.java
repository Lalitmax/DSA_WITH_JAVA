 
import java.util.*;
class HelloWorld {
    public static class Edge{
        
        int src;
        int dest;
        
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    
    public static void topSort(ArrayList<Edge>[] graph){
        
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<graph.length; i++){
            
            if(!vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }
        
        
        while(!s.isEmpty()){
            
            System.out.print(s.pop()+" ");
        }
        
    }
    
    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack){
        
        vis[curr] = true;
        
        for(int i=0; i<graph[curr].size(); i++){
            
            int dest = graph[curr].get(i).dest;
            
            if(!vis[curr]){
                topSortUtil(graph, dest, vis, stack);
            }
        }
        
        stack.push(curr);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int V  = 2;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0; i<V; i++) graph[i] =new ArrayList<>();


        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,0));
        
        topSort(graph);
        
        
        
        
    }
}
