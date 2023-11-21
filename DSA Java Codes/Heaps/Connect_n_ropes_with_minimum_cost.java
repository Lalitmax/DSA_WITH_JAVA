import java.util.PriorityQueue;

public class Connect_n_ropes_with_minimum_cost {
    public static void main(String arg[]){
       int ropes[] = {2,3,3,4,6}; // 4,3,2,6
        int k=2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }

        int cost=0;
        while(pq.size()>1){
            int sum = pq.remove()+pq.remove();
 
            cost +=sum;

            pq.add(sum);
        }

        System.out.println(cost);
       
    }
}
 