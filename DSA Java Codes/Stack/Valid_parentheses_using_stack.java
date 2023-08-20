import java.util.*;
public class Valid_parentheses_using_stack {

   public static boolean validParenthese(String str){
      Stack<Character> s = new Stack<>();

      for(int i=0; i<str.length(); i++){
         char ch = str.charAt(i);

         if(ch=='{' || ch=='[' || ch=='('){
            s.push(ch);
         }else {

            // agar khali hai pahli bar me matlan sara closing hai so return false
            if(s.isEmpty()){
               return false;
            }
            if(s.peek() =='(' && ch==')' || s.peek() =='[' && ch==']' || s.peek()=='{' && ch=='}'){
               s.pop();
            }else {
               return false;
            }

         }
      }
      // empty then all opening have  closing brackets
      if(s.isEmpty()){
         return true;
      }else {
         return false;
      }
   }
   public static void main(String[] args) {
      String str = "({[]})";
      System.out.println(validParenthese(str));
   }
}
