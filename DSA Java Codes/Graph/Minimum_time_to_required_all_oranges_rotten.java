class Minimum_time_to_required_all_oranges_rotten {

    public static class Pair{
        int row;
        int col;
        int time;

        public Pair(int row, int col, int time){
            this.row=row;this.col=col;this.time=time;
        }

    }
    public int orangesRotting(int[][] grid) {

        int n=grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];

        Queue<Pair> q = new LinkedList<>();

        int oneCnt = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                if(grid[i][j]==1) oneCnt++;
                
            }
        }

        int dRow[] = {-1,0,1,0};
        int dCol[] = {0,1,0,-1};
        int totalRotten = 0;
        int totalTime=0;

        while(!q.isEmpty()){
            Pair curr = q.remove();

            int r = curr.row;
            int c = curr.col;
            int t = curr.time;
            totalTime = Math.max(totalTime,t);

            for(int i=0; i<4; i++){
                int nRow = r+ dRow[i];
                int nCol = c+dCol[i];

                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && vis[nRow][nCol]!=2 && grid[nRow][nCol]==1){
                    q.add(new Pair(nRow,nCol,t+1));
                    vis[nRow][nCol]=2;
                    totalRotten++;
                }

            }
        }

        if(oneCnt==totalRotten){
            return totalTime;
        }

        return -1;


        
        
    }
}