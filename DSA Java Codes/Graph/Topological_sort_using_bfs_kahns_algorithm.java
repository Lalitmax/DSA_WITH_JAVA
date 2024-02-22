import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Topological sort using bfs kahns algorithm
 */
public class Topological_sort_using_bfs_kahns_algorithm {

    static class Edge{

        int src,dest;
        public Edge(int src, int dest){
            this.src = src ;
            this.dest=dest;

        }
    
        
    }

    public static void calcIndeg(ArrayList<Edge>[] graph, int indeg[]){

        for(int i=0; i<graph.length; i++){
             int v = i;
            for(int j=0; j<graph[v].size(); j++){
                int dest = graph[v].get(j).dest;
                indeg[dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge>[] graph){
        int indeg[] = new int[graph.length];


        Queue<Integer> q  = new LinkedList<>();

        calcIndeg(graph, indeg);

        for(int i=0; i<indeg.length; i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        while (!q.isEmpty()) {

            int curr = q.remove();


            System.out.print(curr+" ");

            for(int i=0; i<graph[curr].size(); i++){
                int dest = graph[curr].get(i).dest;

                indeg[dest]--;

                if(indeg[dest]==0){
                    q.add(dest);
                }
            }
            
        }



    }

    public static void main(String[] args) {
        int V  = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0; i<V; i++) graph[i] =new ArrayList<>();


        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        topSort(graph);

        
    }

    
}