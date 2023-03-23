import java.util.*;

public class Reads_a_set_of_integers_and_print_the_sum_even_and_odd_integers1 {
    public static void main(String ars[]) {
        Scanner ss = new Scanner(System.in);

        int check;
        int oddsum = 0;
        int evensum = 0;

        do {
            System.out.print("Enter the number : ");
            int num = ss.nextInt();
            if (num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }

            System.out.print("If you wnat to continue then enter 1 , for exit enter 0 : ");
            check = ss.nextInt();
        } while (check == 1);

        System.out.println("Even sum = " + evensum);
        System.out.println("Odd sum = " + oddsum);
    }
    
}

