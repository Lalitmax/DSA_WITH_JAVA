import java.util.*;

public class Display_all_numbers_entered_by_user_except_multiples_of_10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter your number : ");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n+" ");

        
        }while(true);
    }
}
