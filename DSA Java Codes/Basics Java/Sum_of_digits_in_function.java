import java.util.*;

public class Sum_of_digits_in_function {
    public static long sumOfDigits(long digits) {
        long sum = 0;
        while (digits > 0) {
            long lastDigit = digits % 10;
            sum = sum + lastDigit;
            digits /= 10;
        }

        return sum;
    }

    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the digits : ");
        long digits = ss.nextInt();

        System.out.println("The sum of digits = " + sumOfDigits(digits));

    }
}
