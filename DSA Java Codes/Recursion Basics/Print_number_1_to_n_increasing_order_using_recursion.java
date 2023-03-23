
public class Print_number_1_to_n_increasing_order_using_recursion {

    public static void printInc(int n) {
        // base case
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        // f(n-1)
        printInc(n - 1);

        // work (kaam)
        System.out.print(n + " ");
    }

    public static void main(String args[]) {

        printInc(10);

    }
}
