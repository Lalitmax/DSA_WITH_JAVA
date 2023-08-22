import java.util.*;

public class SimplyFy_string_using_stack {

   public static String simplyFyPath(String str) {
      Stack<String> s = new Stack<>();
      int n = str.length();
      String ans = "";

      for (int i = 0; i < n; i++) {
         if (str.charAt(i) == '/') {
            continue;
         }
         StringBuilder word = new StringBuilder("");
         while (i < n && str.charAt(i) != '/') {
            word.append(str.charAt(i++));

         }

         String strWord = word.toString();
         if (strWord.equals(".")) {
            continue;
         } else if (strWord.equals("..")) {
            if (!s.isEmpty()) {
               s.pop();
            }
         } else {
            s.push(strWord);
         }

      }
      if(s.isEmpty()){
         return "/";
      }

      while(!s.isEmpty()){
         ans = "/"+ s.pop()+ans;
      }

      return ans;

   }

   public static void main(String[] args) {
      String str = "/home/video/football/ronaldo/../...////../audio";
      System.out.print(simplyFyPath(str));
   }
}
