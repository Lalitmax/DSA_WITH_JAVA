import java.util.Scanner;

public class switchStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // switch statement

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        switch (n) {
            case 1 : System.out.print("apple");
            break;
            case 2 : System.out.println("banana");
            break;
            case 3 : System.out.println("Coconut");
            break;
            case 4 : System.out.println("Damson");
            break;
            case 5 : System.out.println("Elderberry");
            break;
            default:
            System.out.println("Thank you");
        }

    }
}
