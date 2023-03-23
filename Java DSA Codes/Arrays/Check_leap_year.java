import java.util.*;

public class Check_leap_year {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter year : ");
        int year = sc.nextInt();


        //my code
        // if(year%4==0){
        //     if(year%100==0){
        //         if(year%400==0){
        //             System.out.println(year+" is a leap year");
        //         } else{
        //             System.out.println(year+" is a Not leap year");
        //         }
        //     } else{
        //          System.out.println(year+" is a leap year");
        //         }
        // } else{
        // System.out.println(year+" is a Not leap year");
        // }


        // Apna College code
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 100 == 0) && (year % 400 == 0);

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        

    }
}
