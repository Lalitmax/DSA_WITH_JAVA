import java.util.*;

public class Print_all_prime_in_a_range {

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

    public static void main(String ar[]) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter range to print prime number : ");

        int start_n = Input.nextInt();
        int end_n = Input.nextInt();
        for (int i = start_n; i <= end_n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }

    }

}
