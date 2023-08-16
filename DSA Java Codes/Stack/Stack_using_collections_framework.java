import java.util.* ;

public class Stack_using_collections_framework {
   public static void main(String[] args) {
      Stack<Integer> s = new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);

      while(!s.isEmpty()){
         System.out.print(s.peek()+" ");
         s.pop();
      }
   }
   
}
