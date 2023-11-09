import java.util.PriorityQueue;
import java.util.Comparator;

public class Priority_Queue {
   public static void main(String[] args) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      // for reverse order peeking
      // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

      pq.add(3);
      pq.add(2);
      pq.add(7);
      pq.add(5);
      pq.add(1);

      while(!pq.isEmpty()){
         System.out.print(pq.peek()+" ");
         pq.remove();
      }
   }

   
}
