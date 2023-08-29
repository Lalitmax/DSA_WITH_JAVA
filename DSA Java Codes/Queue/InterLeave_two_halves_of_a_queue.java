import java.util.*;
public class InterLeave_two_halves_of_a_queue {
   public static Queue interLeveHalves(Queue<Integer> q){
      Queue<Integer> newQ = new LinkedList<>();

      int size = (q.size())/2;

      for(int i=0; i<size; i++){
         newQ.add(q.remove());
      }
      while(!newQ.isEmpty()){
        
         q.add(newQ.remove());
         q.add(q.remove());
      }



      return q;
   }

   public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      q.add(6);
      q.add(7);
      q.add(8);
      q.add(9);
      q.add(10);
      
      // 1 6 2 7 3 8 4 9 5 10 ans
      // System.out.print(q.size());
      q=interLeveHalves(q);
      while(!q.isEmpty()){
         System.out.print(q.remove()+" ");
      }




      
   }
}
