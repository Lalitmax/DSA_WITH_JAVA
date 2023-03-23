public class Transpose_of_matrix {
    public static void transposeMatrix(String matrix[][], String TransposeedMatrix[][]) {
        // transpose of matrix
        int n = TransposeedMatrix.length, m = TransposeedMatrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                TransposeedMatrix[i][j] = matrix[j][i];
            }
        }
    }

    public static void main(String args[]) {

        String matrix[][] = { { "a11", "a12", "a13" },
                { "a21", "a22", "a23" } };

        String TransposeedMatrix[][] = new String[matrix[0].length][matrix.length];
        transposeMatrix(matrix, TransposeedMatrix);
        // print transposed matrix
        int n = TransposeedMatrix.length, m = TransposeedMatrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(TransposeedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
