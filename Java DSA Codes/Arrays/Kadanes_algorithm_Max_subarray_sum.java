public class Kadanes_algorithm_Max_subarray_sum {
    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if (curSum < 0) {
                curSum = 0;
            }

            if (maxSum < curSum) {
                maxSum = curSum;
            }

        }
        System.out.println(maxSum);
    }

    public static void main(String args[]) {

        int arr[] = { -1, -2, -3, -4 };
        kadanes(arr);

    }

}