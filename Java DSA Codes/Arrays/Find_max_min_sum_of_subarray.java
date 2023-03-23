import java.util.*;

public class Find_max_min_sum_of_subarray {

    public static void sum_of_subArray(int arr[]) {
        // print sum of subarray
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    
                    sum += arr[k];
                }

                if (maxNum < sum) {
                    maxNum = sum;
                }
                if (minNum > sum) {
                    minNum = sum;
                }
                System.out.println();

            }
        }
        System.out.println("The max sum of subarray = " + maxNum);
        System.out.println("The min sum of subarray = " + minNum);

    }

    public static void main(String args[]) {

        int arr[] = { 1, -2, 6, -1, 3 };
        sum_of_subArray(arr);

    }
}
