import java.util.ArrayList;

public class PrintAllPath {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void printAllPath(ArrayList<Edge>[] graph, boolean vis[], int curr, int tar,  String str){ // TC=O(V^V) exponensial time
        
    if(tar==curr){
        System.out.println(str+" ");
        return;
    }

    for(int i=0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        if(!vis[e.dest]){

            vis[curr]=true;
            printAllPath(graph,vis,e.dest,tar ,str+" "+e.dest);
            vis[curr]=false;

        }
    }


    }

    public static void main(String args[]) {
        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0; i<V; i++){
            graph[i]=new ArrayList<>();

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
        int dest=5;

        printAllPath(graph , new boolean[V], src,dest,"0");
     

    }

}
