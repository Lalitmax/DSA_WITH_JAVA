public class Find_product_of_a_and_b_in_function {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {

        int a = 10, b = 6;

        int ans = multiply(a, b); // call by value
        System.out.println("a * b = " + ans);

    }
}
