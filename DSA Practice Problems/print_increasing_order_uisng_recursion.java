public class print_increasing_order_uisng_recursion {
   public static void printInc(int n){

      if(n==1){
         System.out.print(n+" ");
         return;

      }
       
      printInc(n-1);
      printInc(n-1); 
      System.out.print(n+" ");

      

   }
   public static void main(String s[]){
      int n=4;
      printInc(n);
   }
}
