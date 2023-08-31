import java.util.*;
public class Implement_stack_using_Deque {
   public static class Stack{
      static Deque<Integer> dq = new LinkedList<>();

      public static void push(int data){
         dq.addLast(data);
      }

      public static int pop(){
         return dq.removeLast();
      }

      public static int peek(){
         return dq.getLast();
      }

      public static boolean isEmpty(){
         return dq.isEmpty();
      }


   }
   public static void main(String[] args) {

      Stack s = new Stack();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      s.push(5);

     
      while(!s.isEmpty()){
          System.out.print(s.pop()+" ");
      }

      

      
   }
}
