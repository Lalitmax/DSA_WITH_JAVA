public class Prefix_sumarray_find_max_sum_array {

    public static void printPrefix(int prefix[]) {
        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
    }

    public static void prefixSumArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int prefix_sum[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            prefix_sum[i] = ((i == 0) ? prefix_sum[i] : prefix_sum[i - 1]) + arr[i];

        }
        // printPrefix(prefix_sum);
        for (int i = 0; i < prefix_sum.length; i++) {

            int currentSum = 0;
            for (int j = i; j < prefix_sum.length; j++) {
                currentSum = i == 0 ? prefix_sum[j] : prefix_sum[j] - prefix_sum[i - 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }

                if (minSum > currentSum) {
                    minSum = currentSum;
                }
            }

        }

        System.out.print("Max sum = " + maxSum);
        System.out.print("\nMin sum = " + minSum);
    }

    public static void main(String args[]) {

        int arr[] = { -2, -5, -1, 6, -4, -9, -4 };
        prefixSumArray(arr);

    }
}
