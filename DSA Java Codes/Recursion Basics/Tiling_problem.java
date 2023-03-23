public class Tiling_problem {
    public static void main(String args[]) {

        int n = 5;
        System.out.println(tiling(n));

    }

    public static int tiling(int n) {

        // base case
        if (n == 1 || n == 0) {
            return 1;
        }

        // vertical choice
        int fnm1 = tiling(n - 1);

        // horizontal choice
        int fnm2 = tiling(n - 2);

        int total = fnm1 + fnm2;
        return total;

    }
}
