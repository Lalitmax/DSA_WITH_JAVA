import java.util.Scanner;
import java.util.*;
public class checkFailPass {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");

        int marks=sc.nextInt();
        // if(marks>=0 && marks<33){
        //     System.out.println("Fail");
        // } else if(marks>=33 && marks <=100){
        //     System.out.println("Pass");
        // } else{
        //     System.out.println("Invalid marks");
        // }

        // use ternary operator 

        String result=(marks>=33)? "pass":"Fail";
        System.out.println(result);
    
    }
}
