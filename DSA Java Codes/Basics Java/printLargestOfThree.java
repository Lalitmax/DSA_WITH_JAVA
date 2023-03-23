import java.util.*;
public class printLargestOfThree {
    public static void main(String args[]){
    
        // check largest of three number 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number : ");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            if(b>c){
                System.out.println("The largest number is "+a);
            } else{
                System.out.println("The largest number is "+c);
                 }  
            } else if(b>c){
                System.out.println("The largest number is "+b);
            } else{
                System.out.println("The largest number is "+c);
            }
        
    
    
    }
}
