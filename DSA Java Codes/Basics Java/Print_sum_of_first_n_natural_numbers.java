import java.util.*;

public class Print_sum_of_first_n_natural_numbers {
    public static void main(String args[]) {

        // Print sum of first n natural numbers

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        int sum = 0;
        int cnt = 1;
        while (cnt <= n) {
            sum += cnt;
            cnt++;
        }
        System.out.print("Sum is " + sum);

    }
}
