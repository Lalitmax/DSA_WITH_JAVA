import java.util.*;
import java.util.Arrays;
public class Chocola_problem {
   public static void main(String args[]){
      int m=6;
      int n=4;
      Integer costVer[] = {2,1,3,1,4}; // m-1
      Integer costHor[] = {4,1,2};  // n-1


      // sort descending  costVer
      Arrays.sort(costVer,Collections.reverseOrder());

      // sort descending costHor
      Arrays.sort(costHor,Collections.reverseOrder());


      int h=0; int v=0;
      int hp = 1; int vp =1 ;

      int cost=0;
      while(h<costHor.length && v<costVer.length){
         if(costVer[v]<=costHor[h]){
            cost +=(costHor[h]*vp);
            h++;
            hp++;

         }else{
            cost +=(costVer[v]*hp);
            vp++;
            v++;
         }
      }

      while(h<costHor.length){
          cost +=(costHor[h]*vp);
            h++;
            hp++;

      }

      while(v<costVer.length){
           cost +=(costVer[v]*hp);
            vp++;
            v++;

      }
      

      System.out.println("Cost : "+cost);
   




      }
}
