public class Function {

    // user created function
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        return;
    }

    // main function
    public static void main(String args[]) {
        printHelloWorld(); // first call
        printHelloWorld(); // second call

    }
}
