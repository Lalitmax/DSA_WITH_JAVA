import java.util.*;
public class checkLargestOfTwoNumber {
    public static void main(String args[]){
        
        // check largest number of two
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1=sc.nextInt();

        System.out.print("Enter num2 : ");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("The largest number is "+num1);
        } else{
            System.out.println("The largest number is "+num2);
        }


    
    
    }
}
