class Solution {
    private final int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
    private boolean[][] visited;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        int rowLen = grid2.length;
        int colLen = grid2[0].length;
        int subIslandsCnt = 0;
        visited = new boolean[rowLen][colLen];
        for(int i=0;i<rowLen;i++)
        {
            for(int j=0;j<colLen;j++)
            {
                if(grid2[i][j] == 1 && !visited[i][j] )
                {
                    if(checkIsSubIsland(i,j,grid1,grid2))
                        subIslandsCnt++;
                }
            }
        }
        return subIslandsCnt;
    }
    public boolean checkIsSubIsland(int row,int col,int[][] grid1,int[][] grid2)
    {
        int rowLen = grid2.length;
        int colLen = grid2[0].length;
        boolean isSubIsland = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row,col});
        visited[row][col] = true;
        while(!q.isEmpty())
        {
            int[] cell = q.poll();
            if(grid1[cell[0]][cell[1]] != 1)
                isSubIsland = false;
            for(int[] each_dir : dir)
            {
                int newRow = cell[0] + each_dir[0];
                int newCol = cell[1] + each_dir[1];
                
                if(checkIsValidCell(newRow,newCol,rowLen,colLen) && grid2[newRow][newCol] == 1 && !visited[newRow][newCol] )
                {
                    q.add(new int[]{newRow,newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }
        return isSubIsland;
    }
    public boolean checkIsValidCell(int row,int col,int rowSize,int colSize)
    {
        if(row >= 0 && row < rowSize && col >= 0 && col < colSize)
            return true;
        return false;
    }
}