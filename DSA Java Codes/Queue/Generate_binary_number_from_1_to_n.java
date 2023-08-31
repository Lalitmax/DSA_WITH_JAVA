import java.util.*;
public class Generate_binary_number_from_1_to_n {
   public static ArrayList<String> generate(int n){

         Queue<String> q = new LinkedList<>();
         ArrayList<String> al = new ArrayList<>();
         q.add("1");
         while(n>0){ // (n-- >0) also use
            String temp = q.remove();

            al.add(temp);
            q.add(temp+"0");
            q.add(temp+"1");
            n--;


         }

         return al;

   }
   public static void main(String[] args) {
      int n=100;
      ArrayList<String> al = new ArrayList<>();

      al = generate(n);

      for(int i=0; i<al.size(); i++){
         System.out.print(al.get(i)+" ");

      }
      
   }
}
