class Solution {
    private  int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
    public int minDays(int[][] grid) {

        int initialIslandsCnt = cntIslands(grid);
        
        if(initialIslandsCnt != 1)
        {
            return 0;// 0 min days required
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 0)
                    continue;
                
                    grid[i][j] = 0;
                    System.out.println("changed at i = "+i+"j="+j);
                    if(cntIslands(grid) != 1)
                    {
                        return 1;
                    }
                
                grid[i][j] = 1;
                }
         }
        return 2;

        
    }
    public int cntIslands(int[][] grid)
    {
        int noOfIslands = 0;
        System.out.println("grid " +Arrays.deepToString(grid));
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(!visited[i][j] && grid[i][j] == 1)
                {
                    noOfIslands++;
                    exploreIsland(grid,i,j,visited);
                }
            }
        }
        System.out.println("after cnt insland = +"+Arrays.deepToString(grid));
        System.out.println("return islands = "+noOfIslands);
        return noOfIslands;
    }
    public void exploreIsland(int[][] grid,int row,int col,boolean[][] visited)
    {
    
        visited[row][col] = true;
        for(int[] each_dir : dir)
        {
            int newRow = row + each_dir[0];
            int newCol = col + each_dir[1];
            if(isValidCell(newRow,newCol,grid.length,grid[0].length) && !visited[newRow][newCol] && grid[newRow][newCol] == 1)
            {
                 exploreIsland(grid,newRow,newCol,visited);
            }
        }
    }
    public static boolean isValidCell(int row,int col,int rowSize,int colSize)
    {
        if(row >= 0 && row < rowSize && col >= 0 && col < colSize)
            return true;
        return false;
    }
}