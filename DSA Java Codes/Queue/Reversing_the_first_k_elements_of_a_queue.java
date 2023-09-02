import java.util.*;
public class Reversing_the_first_k_elements_of_a_queue {

   public static Queue<Integer> reverseQFirstQueue(Queue<Integer> q, int k){

      Stack<Integer> s = new Stack<>();
      Queue<Integer> newQ = new LinkedList<>();

      for(int i=0; i<k; i++){
         s.push(q.remove());
      }

      for(int i=0; i<k; i++){

         newQ.add(s.pop());
      }

      while(!q.isEmpty()){
         newQ.add(q.remove());
      }

      return newQ;


   }
   public static void main(String[] args) {
      // [10, 20, 30, 40, 50, 60, 70,80, 90, 100]
      Queue<Integer> q = new LinkedList<>();

      q.add(10);
      q.add(20);
      q.add(30);
      q.add(40);
      q.add(50);
      q.add(60);
      q.add(70);
      q.add(80);
      q.add(90);
      q.add(100);

      int k=5;

      q = reverseQFirstQueue(q,k);

      while(!q.isEmpty()){
         System.out.print(q.remove()+" ");
      }


   }
}
