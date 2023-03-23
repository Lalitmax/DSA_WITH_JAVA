import java.util.*;

public class Check_even_odd_with_operator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("Even number");
        } else {
            // odd number
            System.out.println("Odd number");

        }

    }
}
