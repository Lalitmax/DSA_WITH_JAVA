 import java.util.*;
class Detect_cycle_in_undirected_graph_using_union_findimport{
    static class DisjointSet{
        static int rank[];
        static int par[];

        public DisjointSet(int n){
            rank = new int[n];
            par = new int[n];
            for(int i=0; i<n; i++){
                par[i]=i;
            }
        }


        public boolean union(int x, int y){

            int parA = find(x);
            int parB = find(y);

            if(parA==parB){
                return true;
            }else if(rank[parA]==rank[parB]){
                par[parB] = parA;
                rank[parA]++;

            }else if(rank[parA]>rank[parB]){

                par[parB] = parA;
            }else{
                par[parA] = parB;
            }

            return false;

        }

        public int find(int x){
            if(x==par[x]) return x;

            return find(par[x]);

             
        }
    }
    public static class Edge {
        int src,dest;

        public Edge(int s, int d){
            src = s;
            dest = d;
        }
    
        
    }

     
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0; i<V; i++){
            graph[i]  = new ArrayList<>();
        }
        
        graph[1].add(new Edge(1,5));
        graph[1].add(new Edge(1,9));

        graph[2].add(new Edge(2,5));
        graph[2].add(new Edge(2,7));

        graph[5].add(new Edge(5,1));
        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,9));

        graph[7].add(new Edge(7,2));

        graph[9].add(new Edge(9,1));
        graph[9].add(new Edge(9,5));

        DisjointSet ds = new DisjointSet(9);

        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){

               // how to do i don't know learn it later


            }
        }

    }
}