import java.util.*;

public class Break_statement {
    public static void main(String args[]) {

        // print all number when i==3 break
        int n = 10;

        for (int i = 1; i <= n; i++) {
            if (i == 3) {
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println("I am out of the loop");

    }
}
