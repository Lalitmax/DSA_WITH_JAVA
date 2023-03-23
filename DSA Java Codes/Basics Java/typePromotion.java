import java.util.Scanner;
public class typePromotion {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        char ch='a';
        char ch2='c';
        int ans=ch2-ch;
        System.out.println(ans);  // print 2
        // interesting things
        char ch3='b';
        System.out.println((int)ch3);
        int ans2=45+ch3;  // ascii value of b = 98
        System.out.println(ans2);  // print 98+45 = 143

        // byte
        char ch4='a';
        short sh=43;
        byte bt=5;

        byte ans3= (byte) (ch4+sh+bt);
        System.out.println(ans3); // print -111   no sense about this answer

    }
}
