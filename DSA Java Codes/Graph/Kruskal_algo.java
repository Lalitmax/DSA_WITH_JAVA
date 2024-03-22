import java.util.ArrayList;
import java.util.Collections;

class Kruskal_algo{

    public static class Edge implements Comparable<Edge>{
        int src, dest,wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override

        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }
    public static class DisjointSet{
        static int par[];
        static int rank[];

        public DisjointSet(int n){
            rank=new int[n];
            par=new int[n];

            for(int i=0; i<n; i++){
                par[i]=i;
            }

        }

        public int find(int x){
            if(x==par[x])return x;

            return par[x]=find(par[x]);

        }

        public void union(int x, int y){
            int parA=find(x);
            int parB = find(y);

            if(parA==parB)return;

            if(rank[parA]==rank[parB]){
                par[parB]= parA;
                rank[parA]++;

            }else if(rank[parA]<rank[parB]){
                par[parB]=parA;
            }else{
                par[parA]= parB;
            }

        }

    }

    public static void createGraph(ArrayList<Edge> edges){

        edges.add(new Edge(1,4,1));
        edges.add(new Edge(2,3,3)); 

        edges.add(new Edge(1,2,2));
        edges.add(new Edge(1,5,4));

        edges.add(new Edge(3,4,5));
        edges.add(new Edge(3,6,8));

        edges.add(new Edge(2,6,7));
        edges.add(new Edge(4,5,9));

        edges.add(new Edge(2,4,3));



        
    }

    public static int kruskal(ArrayList<Edge> edges, int V){ // O(v+ElogE)
        DisjointSet ds = new DisjointSet(V+1);
        Collections.sort(edges);
        int mstCost=0;
         

        for(int i=0; i<edges.size()-1; i++){
            Edge e = edges.get(i);

            int parA = ds.find(e.src);
            int parB = ds.find(e.dest);

            if(parA!=parB){
                ds.union(e.src, e.dest);
                mstCost +=e.wt;
            }
        }

        return mstCost;
        


    }
    public static void main(String srga[]){
        
	    
	     ArrayList<Edge> edge = new ArrayList<>();
         createGraph(edge);
         System.out.println(kruskal(edge,edge.size()));

    }
}