public class Nqueens {

    public static void nQueens(char board[][], int i) {
        // base case
        if (board.length == i) {
            printNqueens(board);
            return;
        }
        // recrusion
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board,i,j)){
                board[i][j] = 'Q';
                nQueens(board, i + 1);
                board[i][j] = '.';
            }
        }
    }
    public static boolean isSafe(char board[][], int row, int col){
       
        // vertically up

        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){

            if(board[i][j]=='Q'){
                return false;
            }
        }

        // diagonal right up

        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void printNqueens(char board[][]) {
        int n = board.length;
        System.out.println("-----------ChessBoard-----------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board,0);
    }

}
