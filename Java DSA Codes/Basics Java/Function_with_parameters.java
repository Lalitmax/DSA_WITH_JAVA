import java.util.*;

public class Function_with_parameters {

    public static void calculateSum(int a, int b) { // parameters or formal parameters
        int sum = a + b;
        System.out.println("The sum is " + sum);
 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b); // arguments or actual parameters

    }
}
