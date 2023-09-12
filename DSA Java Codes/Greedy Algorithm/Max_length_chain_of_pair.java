import java.util.Comparator;
import java.util.Arrays;
public class Max_length_chain_of_pair {
   public static void main(String[] args) {
      int pairs[][] = {{5,24},
                      {39,60},
                      {5,28},
                      {27,40},
                      {50,90}};
      // sort
      Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

     int maxLen=1;
     int pairLast=pairs[0][1];

     for(int i=1; i<pairs.length; i++ ){
      if(pairs[i][0]>pairLast){
         maxLen++;
         pairLast=pairs[i][1];
      }
     }
     System.out.println("Max length of chain : "+maxLen);



   }
}
