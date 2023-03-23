import java.util.*;

public class print_doller_100_times {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        // print_doller_100_times
        int cnt = 1;
        do {
            System.out.print("$" + " ");
             cnt++;  
        }while(cnt<=n);

    }
}
