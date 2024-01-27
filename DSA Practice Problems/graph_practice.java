import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph_practice {

    static class Edge{
        int src,dest,wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest  = dest;
            this.wt = wt;
        }


    }

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();

        boolean visited[] = new boolean[graph.length];


        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr] =true;

                for(int i=0; i<graph[curr].size(); i++){
                    int neighbor = graph[curr].get(i).dest;

                    q.add(neighbor);
                }
            }
        }
    }



    public static void printAllPath(ArrayList<Edge>[] graph, boolean visited[], String path, int src, int tar){

        if(src==tar){
            System.out.println(path);
            return;

        }

        for(int i=0; i<graph[src].size(); i++){

            int dest = graph[src].get(i).dest;

            if(!visited[dest]){

                visited[src]=true;
                printAllPath(graph, visited, path+dest, dest, tar);
                visited[src]=false;
            }
        }
    }

     

    

    public static void main(String args[]){

        int V=7;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
    
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
         
        
        printAllPath(graph, new boolean[V], "0", 0, 5);
        
    }

    
}
