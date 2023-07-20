public class Nqueens_Count_ways {

    public static void nQueens(char board[][], int row) {
        // base case
        if (board.length == row) {
           count++;
            return;
        }

        // recursion

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQueens(board, row + 1);
                board[row][i] = '.';
            }
            
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        int n = board.length;
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

   
        public static int count=0;
        public static void main(String args[]) {
        int n = 5;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);
        System.out.print("No of Possible solution  = "+count);
    }
}
