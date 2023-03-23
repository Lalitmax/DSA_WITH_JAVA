import java.util.*;

public class Print_character_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        char ch = 'A'; // for capital character
        // char ch='a'; for small character
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                // System.out.print(ch++ +" ");
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
