import javax.print.attribute.standard.PrinterName;

public class Print_number_n_to_1_decreasing_order_using_recursion {

    public static void printdec(int n) {
        // base case
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        // work (kaam)
        System.out.print(n + " ");

        // f(n-1)
        printdec(n - 1);
    }

    public static void main(String args[]) {

        printdec(10);
    }
}
