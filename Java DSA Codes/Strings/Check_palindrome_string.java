import java.security.cert.TrustAnchor;

public class Check_palindrome_string {
    public static boolean isPalindrome(String name) {
        int n = name.length();
        for (int i = 0; i < n / 2; i++) {
            if (name.charAt(i) != name.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        String name = "abba";
        if (isPalindrome(name)) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " is not palindrome");
        }

    }
}
