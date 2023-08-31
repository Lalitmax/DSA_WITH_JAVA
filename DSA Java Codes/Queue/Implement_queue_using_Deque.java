import java.util.*;
public class Implement_queue_using_Deque {

   public static class Queue{
      static Deque<Integer>  dq = new LinkedList<>();

      public static void add(int x){
         dq.addLast(x);
      }

      public static int remove(){
         return dq.removeFirst();
      }

      public static int peek(){
         return dq.getFirst();
      }
      public static boolean isEmpty(){
         return dq.isEmpty();
      }
   }
   public static void main(String[] args) {

      Queue q = new Queue();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);

         while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
         }
      
   }
}
