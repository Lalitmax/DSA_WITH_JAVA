import java.util.Scanner;

public class checkOddOeven {
    public static void main(String args[]) {

        // check even odd

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }

    }
}
