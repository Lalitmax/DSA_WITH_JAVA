public class Friends_pairing_problem_using_recursion {
    public static int friendsPairing(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        // // single choice
        // int fnm1 = friendsPairing(n - 1);

        // // pair choice
        // int pairways = friendsPairing(n - 2);
        // int ways = (n - 1) * pairways;

        // // total ways
        // int totalways = ways + fnm1;

        // return totalways;

        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);

    }

    public static void main(String args[]) {

        System.out.println(friendsPairing(3));

    }
}
