import java.util.*;

public class Check_if_a_number_is_prime_of_not {
    public static void main(String ar[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number : ");
    int n=sc.nextInt();

    boolean checker=true;
    for(int i=2; i<n; i++){
        if(n%i==0){
            checker=false;
            break;
        }
    }
    if(checker){
        System.out.println("Prime number");
    } else{
        System.out.println("Not prime");
    }

} 

}
