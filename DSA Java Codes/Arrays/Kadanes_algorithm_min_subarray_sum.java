import java.util.*;

public class Kadanes_algorithm_min_subarray_sum {
    public static void kadanes(int arr[]) {
        int min_sum = Integer.MAX_VALUE;
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if (curSum > 0) {
                curSum = 0;
            }
            // if (min_sum > curSum) {
            // min_sum = curSum;
            // }
            min_sum = Math.min(curSum, min_sum);
        }

        System.out.println("Min sum = " + min_sum);
    }

    public static void main(String args[]) {
        /*
         * for input array
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Enter size of array : ");
         * int size=sc.nextInt();
         * int arr[] = new int[size];
         * for(int i=0; i<arr.length; i++){
         * arr[i]=sc.nextInt();
         * }
         */
        int arr[] = { -2, -5, 4, -6, 4, -9, -1 };
        kadanes(arr);

    }
}
