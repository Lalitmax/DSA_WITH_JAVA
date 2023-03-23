import java.util.*;

public class Find_max_value_in_two_array {

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maxNum(int matrix[][]) {
        int maxn = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxn = Math.max(matrix[i][j], maxn);
            }

        }

        return maxn;
    }

    public static int minNum(int matrix[][]) {
        int minn = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                minn = Math.min(matrix[i][j], minn);
            }

        }

        return minn;
    }

    public static void main(String args[]) {

        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 55, 8 }, { 9, 10, 11, 12 } };
        printMatrix(matrix);
        System.out.println();
        System.out.println();
        System.out.println("Max num is " + maxNum(matrix));
        System.out.println("Min num is " + minNum(matrix));

    }
}
