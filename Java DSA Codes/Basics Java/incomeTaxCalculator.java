import java.util.*;

public class incomeTaxCalculator {
    public static void main(String args[]) {


        // income tax calculator
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter money : ");
        int money = sc.nextInt();
        int tax;
        if (money < 500000 && money > 0) {
            tax = (int) (money * 0);
            System.out.println("Tax is " + tax);
        } else if (money >= 500000 && money < 1000000) {
            tax = (int) (money * 0.2);
            System.out.println("Tax is " + tax);
        } else {
            tax = (int) (money * 0.3);
            System.out.println("Tax is "+tax);
        }

    }
}
