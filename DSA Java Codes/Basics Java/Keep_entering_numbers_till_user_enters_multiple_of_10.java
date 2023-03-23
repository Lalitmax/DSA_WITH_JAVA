import java.util.*;

public class Keep_entering_numbers_till_user_enters_multiple_of_10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);

        } while (true);
        System.out.print("your last number is multiple of 10 ");

    }
}
