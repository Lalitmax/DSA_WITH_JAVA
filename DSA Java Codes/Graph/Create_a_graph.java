import java.util.*;

public class Create_a_graph {
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

    public static void main(String args[]) {
    /*

          (5)
        0-----1
             / \
        (1) /   \ (3)
           /     \
           2-----3  
           \ (1)  /
        (2) \    /(4)
             \  /  
               4
           
         
    */
        int V = 5;
    
        ArrayList<Edge>[] graph = new ArrayList[V]; // null -> empty arraylist

        for(int i=0; i<V; i++){
            graph[i]=new ArrayList<>(); // for making empty arrayList
        }

        //vertex 0
        graph[0].add(new Edge(0,1,5));
        
        //vertex 1
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // vertex 2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        // vertex 3
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,4,4));

        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                System.out.print("("+e.src + " "+e.dest +" "+e.wt+" ),");
            }
             System.out.println();
        }

        // Q Find neighbors of 3
        System.out.println("Q Find neigher of 3");
        for(int i=0; i<graph[3].size(); i++){
            Edge e = graph[3].get(i);
            System.out.print(e.dest+" ");
        }

        

        
        
    }

}
