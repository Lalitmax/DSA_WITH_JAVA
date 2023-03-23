import java.util.*;

public class Print_number_frome_one_to_n {
    public static void main(String args[]) {

        // Print one to n number

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  n : ");

        int n = sc.nextInt();

        int cnt = 1;
        while (cnt <= n) {
            System.out.print(cnt + " ");
            cnt++;
        }

    }
}
