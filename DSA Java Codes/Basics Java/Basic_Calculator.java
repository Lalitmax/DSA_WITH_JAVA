import java.util.*;
class Basic_Calculator{
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        int a,b;
        char ch;
        System.out.print("Enter a : ");
        a=ss.nextInt();
        System.out.print("Enter arithmetic operator (+-/*%) : ");
        ch=ss.next().charAt(0);
        System.out.print("Enter b : ");
        b=ss.nextInt();
        
        if(ch=='+'){
            System.out.print("a + b = "+a+b);
        } else if(ch=='-'){
            System.out.print("a - b = "+(a-b));
        } else if (ch=='*'){
            System.out.println("a * b = "+a*b);
        } else if (ch=='/'){
            System.out.println("a / b = "+a/b);
        } else if (ch=='%'){
            System.out.println("a % b = "+a%b);
        } else{
            System.out.println("Wrong operator");
        }
    }
}