public class Print_sum_of_second_row {
    public static int secondSum(int nums[][], int sr) {
        int sum = 0;
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[sr][j];
        }

        return sum;
    }

    public static void main(String args[]) {

        int nums[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };

        System.out.println(secondSum(nums, 1));

    }
}
