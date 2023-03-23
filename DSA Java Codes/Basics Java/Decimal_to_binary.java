import java.util.*;
public class Decimal_to_binary {

    // decimal to binary
    public static int decimalTwoBinary(int n){
        int pow=0;
        int bi=0;
        while(n>0){
            int remainder=n%2;
            bi=bi+remainder*(int)(Math.pow(10,pow));
            pow++;
            n=n/2;
        }

        return bi;
    }
    public static void main(String args[]){
    
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter in decimal number : ");
        int n=ss.nextInt();
        System.out.println(n+" in binary = "+decimalTwoBinary(n));

    
    
    }
}
