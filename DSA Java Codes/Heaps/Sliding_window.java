import java.util.*;

public class Sliding_window {

    public static class Pair implements Comparable<Pair>{
        int ele;
        int idx;

        public Pair(int ele, int idx){
            this.ele=ele;
            this.idx=idx;
        }

        @Override
        public int compareTo(Pair p2){
            // return this.ele -p2.ele; for ascending
            return p2.ele-this.ele; // for descending
        }


    }
     public static void main(String arg[]){
       int windows[] = {1,3,-1,-3,5,3,6,7}; 
       int k=3;

       ArrayList<Integer> result  = new ArrayList<>();
       PriorityQueue<Pair> pq = new PriorityQueue<>();

       for(int i=0; i<k; i++){
            pq.add(new Pair(windows[i],i));
       }

       result.add(pq.peek().ele);
       for(int i=k; i<windows.length; i++){ // O(n)

            while(pq.size()>0 && pq.peek().idx<=(i-k)){ // O(logk)
                pq.remove();
            }

            pq.add(new Pair(windows[i],i));
            result.add(pq.peek().ele);

       }

       System.out.print(result);


      


        
       
    }
}
