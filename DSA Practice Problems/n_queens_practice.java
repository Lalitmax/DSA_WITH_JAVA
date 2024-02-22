 

/**
 * n_queens_practice
 */
public class n_queens_practice {

    public static boolean check(int board[][], int n, int i, int j){

        //column
        for(int k=0; k<i; k++){

            if(board[k][j]==1) return false;
        }

        // left diag
        int x = i;
        int y = j;


        while (x>=0 && y>=0) {

            if(board[x][y]==1){
                return false;
            }
            x--;
            y--;


            
        }
          x = i;
          y = j;

        // right diag

        while (x>=0 && y<n) {

            if(board[x][y]==1){
                return false;
            }
            x--;
            y++;


            
        }


         

        return true;

    }
 
    public static void printQueen(int board[][]){

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j]+" ");
            }
           System.out.println();
        }
       
         

    }

    public static boolean nqueen(int board[][], int n, int i){

        if(i==n){
            printQueen(board);
           
            return true;
        }


        for(int j=0; j<n; j++){

            if(check(board,n,i,j)){

                board[i][j] = 1;
                boolean s = nqueen(board, n, i+1);
                if(s) return true;

                 

                board[i][j] = 0;
            }
        }

        return false;

         





    }

    public static void main(String[] args) {
        int board[][] = new int [8][8];
         

        int n=8;

        
        
        nqueen(board,n,0);
        
    }
}