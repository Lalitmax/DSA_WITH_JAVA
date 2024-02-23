import java.util.ArrayList;

public class Print_all_path_from_src_to_tar_in_directed_graph {

    static class Edge{
        int src,dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void allPath(ArrayList<Edge>[] graph,int src, int tar, String path){ 
        // T.C = (V^2)

        if(src==tar){
            System.out.println(path+" ");
            return;
        }
 



        for(int i=0; i<graph[src].size(); i++){
             int dest = graph[src].get(i).dest;

              allPath(graph, dest, tar, path+"->"+dest);
        }

    }
    public static void main(String[] args) {

        int V=6;
        ArrayList<Edge>[]  graph = new ArrayList[6];
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();

        }

        graph[0].add(new Edge(0,3));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        int src = 5;
        int tar = 3;
        allPath(graph, src, tar, Integer.toString(src));
    }
}
