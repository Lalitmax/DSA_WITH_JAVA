///////////// Introduction to Dynamic Programming /////////////// 

public class Introduction_DP {
    public static int fibo(int n, int dp[]){ // Memoization
        if(n==1 || n==0)return n;

        if(dp[n]!=0)return dp[n];

        int calc = fibo(n-1,dp)+fibo(n-2,dp);
        dp[n] = calc;

        return calc;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibo(n, new int[n+1]));

    }
}
