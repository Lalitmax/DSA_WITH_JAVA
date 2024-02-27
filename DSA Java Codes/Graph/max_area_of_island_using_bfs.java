class max_area_of_island_using_bfs {

    public static class Pair{
        int row;
        int col;
       

        public Pair(int row, int col){
            this.row = row;
            this.col = col;
            
        }
    }

    public static int bfs(int grid[][], boolean vis[][], int row, int col, int n, int m){
        vis[row][col] = true;


        Queue<Pair> q = new LinkedList<>();
        int area=1;
        q.add(new Pair(row,col));

        int dRow[] = {-1,0,1,0};

        int dCol[] = {0,1,0,-1};

        while(!q.isEmpty()){

            Pair curr = q.remove();

            int r = curr.row;
            int c = curr.col;
             

            for(int i=0; i<4; i++){
                int nRow = r+dRow[i];
                int nCol =  c+dCol[i];

                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && !vis[nRow][nCol] && grid[nRow][nCol]==1){
                    area++;
                    q.add(new Pair(nRow,nCol));
                    vis[nRow][nCol]=true;
                }
            }

        }

        return area;






    }


    
    
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;

        int n=grid.length;
        int m = grid[0].length;

        boolean vis[][] = new boolean[n][m];
        

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1){
                    int area = bfs(grid,vis,i,j,n,m);
                    maxArea= Math.max(maxArea,area);

                }
            }
        }
        return maxArea;
        
    }
}