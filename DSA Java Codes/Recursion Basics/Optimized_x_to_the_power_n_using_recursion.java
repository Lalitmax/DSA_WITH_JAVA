public class Optimized_x_to_the_power_n_using_recursion {

    public static int optimizedPower(int x, int n){

        if(n==0){
            return 1;
        }

        int halfPowerSqr = optimizedPower(x, n/2);
        int xn = halfPowerSqr*halfPowerSqr;
        // if n is oddd
        if(n%2 ==1){
            xn = xn*x;
        }
        return xn;

    }
    public static void main(String args[]){

    System.out.println(optimizedPower(2, 10));
        
    
    
    }
}
