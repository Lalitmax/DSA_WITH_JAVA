import java.util.*;

public class Butterfly_pattern {
    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ss.nextInt();

        // upper pattern
        // outer loop
        for (int i = 1; i <= n; i++) {
            /// inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower pattern
        // outer loop
        for (int i = n - 1; i >= 1; i--) {
            /// inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= n - i; k++) {
                System.out.print("  "); // double space
            }

            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
