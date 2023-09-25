public class x_power {
   public static int power(int x, int n){
      if(n==0) return 1;

      int xpn= power(x,n/2);
      int mm = xpn*xpn;
      if(n%2!=0){
         mm = x*mm;
      }

      return mm;

   }
   public static void main(String s[]){
      int x=2;
      int n=10;
      System.out.println(power(x,n));

   }
}
