import java.util.Arrays;
import java.util.Comparator; 
import java.util.ArrayList;
public class Indian_coins {
   public static void main(String[] args) {
      Integer coins[] = {1,3,5,10,20,50,100,500,2000};
      
      Arrays.sort(coins,Comparator.reverseOrder());

      int amount=312;
      int countOfCoins=0;
      int cnt=0;
        int amount2=amount;
      ArrayList<Integer> ans  = new ArrayList<>();

      for(int i=0 ; i<coins.length; i++){
         if(amount>=coins[i]){
            
            while(coins[i]<=amount){
              countOfCoins++;
              ans.add(coins[i]);
              amount -=coins[i];

            }
            
         }
         cnt++;
         if(amount==0){
            break;
         }
        
      }
    
      System.out.println("Count of Coins : "+countOfCoins);

      for(int i=0; i<ans.size(); i++){
         if(i==ans.size()-1){
            System.out.print(ans.get(i)+" =");
         }else{
            System.out.print(ans.get(i)+"+");
         }
      }
      System.out.print(" "+amount2);

   }
}
