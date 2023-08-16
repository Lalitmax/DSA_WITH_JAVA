import java.util.*;

public class Reverse_a_stack {

   public static void pushAtBottom(Stack<Integer> s, int data){

      //base case
      if(s.isEmpty()){
         s.add(data);
         return;
      }
      // work
      int a=s.pop();
      pushAtBottom(s,data);
      s.push(a); 

   }

   public static void reverseStack(Stack<Integer> st){
      
      // base case
      if(st.isEmpty()){
         return;
      }

      // work
      int a = st.pop();
      reverseStack(st);
      pushAtBottom(st,a);

   }

   
   public static void main(String[] args) {
      Stack<Integer> s = new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);

      reverseStack(s);

      while(!s.isEmpty()){
         System.out.print(s.peek()+" ");
         s.pop();
      }
   }
   
}
