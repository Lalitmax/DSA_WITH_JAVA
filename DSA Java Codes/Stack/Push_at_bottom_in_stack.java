import java.util.*;

public class Push_at_bottom_in_stack {

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
   public static void main(String[] args) {
      Stack<Integer> s = new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);

      pushAtBottom(s,4);

      while(!s.isEmpty()){
         System.out.print(s.peek()+" ");
         s.pop();
      }
      
   }
   
}
