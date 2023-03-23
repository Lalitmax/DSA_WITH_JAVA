import java.util.Scanner;

import java.util.*;

public class Calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number2 : ");
        int b = sc.nextInt();
        System.out.print("Enter operator ' + - * / % ' : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a * b);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
