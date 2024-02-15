import java.lang.reflect.Array;
import java.util.ArrayList;
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

    public static void dfs(ArrayList<Edge>[] graph, int src, boolean v[]) {
        v[src] = true;

        System.out.println(src + " ");

        for (int i = 0; i < graph[src].size(); i++) {
            int curr = graph[src].get(i).dest;

            if (!v[curr]) {
                dfs(graph, curr, v);
            }
        }

    }

    public static void bft(ArrayList<Edge>[] graph) {

        boolean[] v = new boolean[graph.length];

        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        while (!q.isEmpty()) {

            int curr = q.remove();

            if (!v[curr]) {
                System.out.print(curr + " ");
                v[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    if (!v[graph[curr].get(i).dest]) {
                        q.add(graph[curr].get(i).dest);
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        // create Adjacency list

        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];

        // yet not initialized

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

        // graph[6].add(new Edge(6, 5));

        // graph[0].add(new Edge(0,1));
        // graph[0].add(new Edge(0,2));

        // graph[1].add(new Edge(1,0));
        // graph[1].add(new Edge(1,3));

        // graph[2].add(new Edge(2,0));
        // graph[2].add(new Edge(2,4));

        // graph[3].add(new Edge(3,1));
        // graph[3].add(new Edge(3,4));
        // graph[3].add(new Edge(3,5));

        // graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5,3));
        // graph[5].add(new Edge(5,4));
        // graph[5].add(new Edge(5,6));

        // graph[6].add(new Edge(6, 5));

        // printSrcToTar(graph, 0, new boolean[V], "0", 5);
        System.out.println(detectCycle(graph));

    }

    public static boolean isBp(ArrayList<Edge>[] graph){

        int colors[] = new int[graph.length];

        for(int i=0; i<graph.length; i++){
            colors[i]=-1;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            if(colors[i]==-1){
                q.add(i);
                colors[i]=0; // yellow

                while(!q.isEmpty()){

                    int curr = q.remove();

                    for(int j=0; j<graph[curr].size(); j++){
                        int dest  = graph[curr].get(j).dest;

                        if(colors[dest]==-1){
                            int nextColor = colors[curr] == 0 ? 1 : 0;
                            colors[dest]=nextColor;
                            q.add(dest);
                        }else if(colors[dest] ==colors[curr]){
                            return false;

                        }

                    }
                }
            }
        }

        return true;
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {

        boolean[] v = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!v[i]) {
                if (detectCycleUtil(graph, i, -1, v)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, int par, boolean[] v) {

        v[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {

            int dest = graph[curr].get(i).dest;

            if (!v[dest]) {
                if (detectCycleUtil(graph, dest, curr, v)) {
                    return true;
                }
            } else if (dest != par) {
                return true;
            }

        }

        return false;

    }

    public static void printSrcToTar(ArrayList<Edge> graph[], int src, boolean v[], String str, int tar) {

        v[src] = true;
        if (src == tar) {
            System.out.println(str);
            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {

            int curr = graph[src].get(i).dest;

            if (!v[curr]) {

                printSrcToTar(graph, curr, v, str + curr, tar);
                v[curr] = false;
            }
        }

    }

}
