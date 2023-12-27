
import java.util.*;
public class Breath_first_search {

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

    public static void bfs(ArrayList<Edge> graph[]){  // T.C = O(V+E) ---> (vertex + edge)
        int n = graph.length;
        boolean visited[] = new boolean[n];
        
        Queue<Integer> q  = new LinkedList<>();

        q.add(graph[0].get(0).src);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(visited[curr]==false){
                System.out.print(curr+" ");

                visited[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }


    }

     
    public static void main(String srg[]){

        /*       1----3\
                /       \
               /          \
             0             5---6
               \         /
                \       /
                 2----4/
           
         */

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V]; // null

        for(int i=0; i<V; i++){
            graph[i]= new ArrayList<>(); // form making empty []
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
         
        bfs(graph);

 

    }
}
