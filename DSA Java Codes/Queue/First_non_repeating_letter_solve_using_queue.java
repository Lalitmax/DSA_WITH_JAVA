import java.util.*;
public class First_non_repeating_letter_solve_using_queue {

   public static void printFirstNonRepeating(String str){
      Queue<Character> q = new LinkedList<>();
      int freq[] = new int[26];
      char ch;

      for(int i=0; i<str.length(); i++){
         ch = str.charAt(i);

         q.add(ch);
         freq[ch-'a']++;

         while(!q.isEmpty() && freq[q.peek()-'a']>1){
            q.remove();
         }

         if(q.isEmpty()){
            System.out.print("-1 ");
         }else{
            System.out.print(q.peek()+" ");
         }
      }

   }
   public static void main(String[] args) {
      String str = "aabccxb";
      printFirstNonRepeating(str);


      
   }
}