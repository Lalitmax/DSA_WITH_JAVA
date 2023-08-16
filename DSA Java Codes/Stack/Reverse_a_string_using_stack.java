import java.util.*;

public class Reverse_a_string_using_stack {



   public static String reverseStr(String str){
      Stack<Character> ch = new Stack<>();

      int indx=0;

      // push in stack
      while(indx<str.length()){
         ch.push(str.charAt(indx));
         indx++;
      }

      
      StringBuilder newStr = new StringBuilder("");
       // remove item in stack and append StringBuilder
       
       while(!ch.isEmpty()){
         newStr.append(ch.pop());
         
      }
      
      return newStr.toString();
   }
   public static void main(String[] args) {
      String str = "abc";
      String ans = reverseStr(str);
      System.out.print(ans);

   }
   
}
