import java.util.*;
public class averageOfThreeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int avg=(a+b+c)/3;
        System.out.println("The average is : "+avg);
    }
}
