import java.util.*;

public class Creating_two_d_array {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix : ");
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        /// output

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
