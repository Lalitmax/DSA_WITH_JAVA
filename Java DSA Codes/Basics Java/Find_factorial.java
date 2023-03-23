import java.util.*;

public class Find_factorial {
    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ss.nextInt();

        // Find_factorial

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.print("The Factorial is  : "+ fact);

    }
}
