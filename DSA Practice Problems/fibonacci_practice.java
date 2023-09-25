public class fibonacci_practice {
   public static int fibo(int n){
      if(n==0 || n==1){
         return n;
      }
       
      int nm1 = fibo(n-1);
      int nm2 = fibo(n-2);

      int ans = nm1+nm2;
      return ans;

   }
   public static void main(String s[]){
      System.out.println(fibo(6));
   }
}
