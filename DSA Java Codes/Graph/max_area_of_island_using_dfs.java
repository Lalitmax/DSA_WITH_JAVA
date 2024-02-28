class max_area_of_island_using_dfs {
    
    public static boolean countIsland(int[][] grid, int i, int j, int arr[]){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return false;


        if(grid[i][j]==0) return false;

        grid[i][j]=0;

        if(countIsland(grid,i-1,j,arr)) arr[0]++;
        if(countIsland(grid,i+1,j,arr)) arr[0]++;
        if(countIsland(grid,i,j-1,arr)) arr[0]++;
        if(countIsland(grid,i,j+1,arr)) arr[0]++;

        return true;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;

        int n=grid.length;
        int m = grid[0].length;
        

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1){
                    int arr[] = {1};
                    countIsland(grid,i,j,arr);
                    maxArea= Math.max(maxArea,arr[0]);

                }
            }
        }
        return maxArea;
        
    }
}