import java.util.*;

public class Kadanes_algorithm_Max_subarray_sum_optimizable {
    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        // if all negative
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
        int max = arr[arr.length - 1]; // get max num ( in last array)

        if (max < 0) {
            System.out.println("Max sum = " + max);

        } else // if some negative and some positive

        {
            for (int i = 0; i < arr.length; i++) {
                curSum += arr[i];

                if (curSum < 0) {
                    curSum = 0;
                }

                if (maxSum < curSum) {
                    maxSum = curSum;
                }

            }
            System.out.println("Max sum = " + maxSum);
        }

    }

    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);

        int arr[] = { -1, -2, -3, -4 };
        kadanes(arr);

    }

}
