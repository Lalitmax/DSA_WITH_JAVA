import java.util.*;
public class typeCastingInJava {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        float number=56.78f;
        int number2=(int)number;
        System.out.println(number2);

        // casting char
        char ch='k';
        int num=ch;
        System.out.println(num);  // print 107 (ascii value)

    }
}
