import java.util.Arrays;
public class Climbing_stairs_using_memoization {
    public static int countWays(int n, int ways[]) { // TC=O(n)
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        int cwnm1 = countWays(n - 1,ways);
        int cwnm2 = countWays(n - 2,ways);

        ways[n] = cwnm1+cwnm2;

        return  ways[n];

    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWays(n, ways));
    }
}
