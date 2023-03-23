public class Tower_of_hanoi_using_reccursion {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 0) {
            return;
        }

        // A to C
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);

        // // A to B
        // towerOfHanoi(n - 1, src, dest, helper);
        // System.out.println("Transfer disk " + n + " from " + src + " to " + helper);
        // towerOfHanoi(n - 1, dest, helper, src);

    }

    public static void main(String args[]) {

        int n = 3;
        towerOfHanoi(n, "A", "B", "C");

    }
}
