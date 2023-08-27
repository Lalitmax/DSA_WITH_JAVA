import java.util.*;
public class Queue_using_java_collection_framework {
   public static void main(String[] args) {
      // Queue<Integer> q = new LinkedList<>();
      Queue<Integer> q = new ArrayDeque<>();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.remove();
      while(!q.isEmpty()){
         System.out.print(q.peek()+" ");
         q.remove();
      }

   }
}
