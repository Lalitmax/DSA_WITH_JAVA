import java.util.ArrayList;
import java.util.*;
 

public class Bipartite_or_not {
    static class Edge{
        int src,dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];

        for(int i=0; i<graph.length; i++){
            col[i]=-1;
        }

        Queue<Integer>  q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){

            if(col[i]==-1){
                col[i]=0; // yellow
                q.add(i);

                while(!q.isEmpty()){
                    int curr = q.remove();

                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e  = graph[curr].get(j);
                        int nextColor = col[curr]==0 ? 1:0;
                        
                        if(col[e.dest]==-1){
                            col[e.dest]=nextColor;
                            q.add(e.dest);
                        }else if(col[e.dest]==col[curr]){
                            return false;
                        }



                    }
                }

            }

        }
        return true;


    }
    public static void main(String srg[]){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));

        System.out.print(isBipartite(graph));

    }
}
