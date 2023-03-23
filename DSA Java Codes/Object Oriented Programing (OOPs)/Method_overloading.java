/*
 Method overloading
 */

public class Method_overloading {
    public static void main(String args[]) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(3, 5));
        System.out.println(calc.sum(3.5f, 5.9f));
        System.out.println(calc.sum(3, 5, 99));

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}