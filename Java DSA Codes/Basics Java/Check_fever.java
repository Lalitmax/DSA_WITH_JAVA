import java.util.Scanner;
import java.util.function.DoubleToIntFunction;
public class Check_fever {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your temperature : ");
        double temperature=sc.nextInt();

        if(temperature>100){
            System.out.println("You have a fever");
        } else{
            System.out.println("You don't have a fever");
        }
        
    
    
    }
}
