import java.util.*;
import java.util.Arrays;
public class Indian_coins_change {
   public static void main(String[] args) {
      Integer coins[] = {1,2,5,10,20,50,100,500,2000};

      Arrays.sort(coins, Comparator.reverseOrder( ));

      ArrayList<Integer> al = new ArrayList<>();
      int amt = 4;
      int count=0;

      for(int i=0; i<coins.length; i++){
         if(amt>=coins[i]){

            while(amt>=coins[i]){
               count++;
               al.add(coins[i]);
               amt -=coins[i];
            }

         }
         if(amt==0){
            break;
         }

      }

      System.out.println("Count of coins : "+count);

      for(int i=0; i<al.size(); i++){
         System.out.print(al.get(i)+" ");
      }


   }
}
