public class print_sum_of_n_natural_number {

   public static int sum(int n){
      if(n==1){
         return 1;
      }
      int sum = n+sum(n-1);

      return sum;
   }
   public static void main(String d[]){
      int n=5;
      System.out.print(sum(n));

   }
}
