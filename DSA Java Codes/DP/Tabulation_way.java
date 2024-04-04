public class Tabulation_way {  // Bottom Up
    public static void main(String[] args) {
        int n=5;
        int dp[] = new int[n+1]; // Inotialization
                                // Meaning 0 and 1 fill
        dp[0]=0; ///filing
        dp[1]=1; // filing
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        System.out.println(dp[n]);
    }
    
}
