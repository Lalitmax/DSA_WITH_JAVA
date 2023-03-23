import java.util.*;

public class Print_reverse_of_a_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        long n = sc.nextInt();
        
        // Reverse the given number
        while (n > 0) {
            int last_digit = (int) n % 10;
            System.out.print(last_digit);
            n  /=10;
        }
    }
}
