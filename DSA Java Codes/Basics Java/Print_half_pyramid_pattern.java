import java.util.*;

public class Print_half_pyramid_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
