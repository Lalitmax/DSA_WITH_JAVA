import java.util.*;

public class Enter_like_12345_so_on_and_print_all_even_sum_and_all_odd_sum {
    public static void main(String ars[]){
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=ss.nextInt();

        int oddsum=0;
        int evensum=0;

        while(n>0){
            int last_digit=n%10;
            if(last_digit%2==0){
                evensum +=last_digit;
            }else{
                oddsum +=last_digit;
            }
            n/=10;

        }

        System.out.println("Even sum = "+evensum);
        System.out.println("Odd sum = "+oddsum);




    }
}
