import java.util.*;

public class Palindromic_pattern_with_numbers_pattern {
    public static void main(String args[]) {

        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ss.nextInt();

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            System.out.println();
        }
    }
}
