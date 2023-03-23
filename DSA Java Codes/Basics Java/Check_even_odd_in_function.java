import java.util.*;
public class Check_even_odd_in_function {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=ss.nextInt();
        if(isEven(n)){
            System.out.println(n+" is a even number");
        } else{
            System.out.println(n+" is a odd number");
        }

        
    
    }
}
