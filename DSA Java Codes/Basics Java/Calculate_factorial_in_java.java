import java.util.*;
public class Calculate_factorial_in_java {
    public static int factorial(int n){
       
        int fact=1;
        for(int i=n; i>=1; i--){
            fact *=i;
        }
        return fact;

    }
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n=sc.nextInt();

        int ans=factorial(n);
        System.out.println("The factorial is "+ans);
        // i can also print 
        // System.out.println(factorial(n));

    
    
    }
}
