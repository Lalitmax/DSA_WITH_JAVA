import java.util.ArrayList;
import java.util.PriorityQueue;

public class connecting_cities_with_minimum_cost_using_matrix   {
 

    public static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        public Pair(int v, int c) {
            this.v = v;
            this.cost = c;
        }

        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }

    }

    public static int minimum_cost(int[][] cities) {
        int minCost = 0;
       


        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];

        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()){

            Pair curr = pq.remove();

            if(!vis[curr.v]){
                minCost +=curr.cost;
                vis[curr.v]=true;

                for(int i=0; i<cities[curr.v].length; i++){

            

                    if(cities[curr.v][i]!=0){
                        int wt = cities[curr.v][i];
                        pq.add(new Pair(i,wt));
                    }
                }
            }
            
        }

        return minCost;
    }

    
    public static void main(String[] args) {

      
        int cities[][] = { { 0, 1, 2, 3, 4 },
                { 1, 0, 5, 0, 7 },
                { 2, 5, 0, 6, 0 },
                { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };

        System.out.println(minimum_cost(cities));

    }

}
