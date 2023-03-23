//Q.  swap two number

public class call_by_value_in_function {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {
        int a, b;
        a = 45;
        b = 67;
        swap(a, b); // call by value

    }
}
