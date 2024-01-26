import java.util.ArrayList;

public class CycleDetection {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                if(detectCycleUtil(graph,visited,i,-1)){
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean visited[], int curr, int par){

        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            // case 3
            if(!visited[e.dest]){
                if(detectCycleUtil(graph,visited,e.dest,curr)){
                    return true;
                }
                
            }

            // case 1
           else  if(visited[e.dest] && e.dest!=par){
                return true;
            }

            //  case2  continue

        }
        return false;
    }


    public static void main(String args[]) {


        int V = 9;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        // graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(0,3,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));

        // graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,1,1));

        graph[3].add(new Edge(3,0,1));
        graph[3].add(new Edge(3,4,1));

        graph[4].add(new Edge(4,3,1));


        System.out.print(detectCycle(graph));

    }

}
