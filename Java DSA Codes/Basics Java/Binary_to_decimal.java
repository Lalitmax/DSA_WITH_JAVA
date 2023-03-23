import java.util.*;

public class Binary_to_decimal {

    // binary to decimal
    public static int binaryTwo_decimal(int n) {
        int pow = 0;

        int dec = 0;
        while (n > 0) {
            int last_digit = n % 10;
            dec = dec + last_digit * (int) (Math.pow(2, pow));

            pow++;
            n = n / 10;
        }
        return dec;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int b = input.nextInt();
        System.out.println(b + " In decimal = " + binaryTwo_decimal(b));

    }
}