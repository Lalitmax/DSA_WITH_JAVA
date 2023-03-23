import java.util.*;

public class Check_palindrome_in_function {
    public static boolean isPalindrome(int n) {
        int orignalNum = n;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        if (rev == orignalNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ss.nextInt();

        System.out.println(n + " is palindrome = " + isPalindrome(n));

    }
}
