public class Diogonal_sum_in_two_d_array {
    public static void diogonnalSum(int matrix[][]) {
        int sum = 0;

        int n = matrix.length - 1;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != n - i) {
                sum += matrix[i][n - i];
            }
        }

        System.out.println("Sum of diagonal = " + sum);

    }

    public static void main(String args[]) {

        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        diogonnalSum(matrix);

    }
}
