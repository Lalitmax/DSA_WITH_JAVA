import java.util.*;

public class Reverse_the_given_number {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        long n = sc.nextInt();
        long rev = 0;
        // Reverse_the_given_number
        while (n > 0) {
            int last_digit = (int) (n % 10);
            rev = rev * 10 + last_digit;
            n /= 10;
        }

        System.out.println("The reverse number is " + rev);

    }
}
