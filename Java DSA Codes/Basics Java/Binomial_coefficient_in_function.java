import java.util.*;

public class Binomial_coefficient_in_function {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int findNcr(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int fact_NminusR = factorial(n - r);
        int nCr = (int) (nFact / (rFact * fact_NminusR));
        return nCr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("For finding nCr \nEnter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();

        int ans = findNcr(n, r);
        System.out.println("nCr = " + ans);

    }
}
