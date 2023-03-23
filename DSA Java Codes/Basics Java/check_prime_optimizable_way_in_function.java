import java.util.*;

public class check_prime_optimizable_way_in_function {
    // check is prime or not
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        if (isprime(n)) {
            System.out.println(n + " is a prime");
        } else {
            System.out.println(n + " is not a prime");
        }

    }
}
