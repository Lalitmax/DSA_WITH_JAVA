import java.util.*;

public class Print_all_odd_and_even_number_till_n {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int i = 0;
        // all even
        System.out.print("Even = ");
        for (; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        
        System.out.println();
        System.out.print("Odd = ");
        // all odd
        int j = 0;
        for (; j < n; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        // i can also write

        /* 
        
        System.out.print("Even = ");
        for (int i=0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
   
        // all odd
        for (int j=0; j < n; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }

         */

    }
}
