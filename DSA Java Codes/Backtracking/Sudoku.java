public class Sudoku {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {

        // row
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // column
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;


        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSol(int sudoku[][], int i, int j) {

        // base case
        if (i == 9 && j == 0) {
            return true;
        }

        // recursion

        int nextRow = i, nextCol = j + 1;
        if (j + 1 == 9) {
            nextRow = i + 1;
            nextCol = 0;
        }
        // is already have any number
        if (sudoku[i][j] != 0) {
            return sudokuSol(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <=9; digit++) {
            if (isSafe(sudoku, i, j, digit)) {
                sudoku[i][j] = digit;
                if (sudokuSol(sudoku, nextRow, nextCol)) {
                    return true;
                } else {
                    sudoku[i][j] = 0;

                }
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        int n = sudoku.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if (sudokuSol(sudoku, 0, 0)) {

            System.out.println("Solution Exits");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not Exits");
        }
    }

}
