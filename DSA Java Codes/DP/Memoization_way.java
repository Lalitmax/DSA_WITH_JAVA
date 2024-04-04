
///////////// Introduction to Dynamic Programming /////////////// 

public class Memoization_way { // Top Down
    public static int fibo(int n, int dp[]) { // Memoization
        if (n == 1 || n == 0)
            return n;

        if (dp[n] != 0)
            return dp[n];

        int calc = fibo(n - 1, dp) + fibo(n - 2, dp);
        dp[n] = calc;

        return calc;
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        fibo(n, dp);

       System.out.println(fibo(n, dp));

    }
}
