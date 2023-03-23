import java.util.Scanner;

import java.util.*;
public class Average_of_three_number_in_function{

    public static int averageFind(int n1, int n2, int n3){
        int avg=(n1+n2+n3)/3;
        return avg;
    }
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number for average find : ");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();
        System.out.println("The average = "+averageFind(n1, n2, n3));

    }
}