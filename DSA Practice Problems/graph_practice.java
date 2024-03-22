import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class graph_practice {

    static class Edge {

        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;

        }
    }


    public static void bfs(ArrayList<Edge>[] graph){

        Queue<Integer>  q = new LinkedList<>();

        q.add(0);
        boolean visited[]=new boolean[graph.length];
        Arrays.fill(visited , false);

        while(!q.isEmpty()){
            int  curr = q.poll();

            if(!visited[curr]){
                visited[curr]=true;
                System.out.println(curr+" ");
                for(int i=0; i<graph[curr].size(); i++){
                    int dest = graph[curr].get(i).dest;

                    if(!visited[dest]){
                        q.add(dest);
                    }
                }
            }

        }
       
    }

    public static  void dfs(ArrayList<Edge>[] graph, int src, boolean[] visited){
        visited[src]=true;

        System.out.println(src+" ");
        for(int i=0; i<graph[src].size(); i++) {
            int dest = graph[src].get(i).dest;

            if(!visited[dest]){
                dfs(graph, dest, visited);
            }

        }

    }

    public static void main(String[] args) {
        // create Adjacency list

        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];
        boolean visited[]=new boolean[graph.length];
        Arrays.fill(visited,false);

        // yet not initialized

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
        // bfs(graph);
        dfs(graph, 0, visited);

 

    }

}
