class Solution {
    private int directions[][] = {{-1,0},{0,1},{1,0},{0,-1}};
    int rows;
    int cols;
    public int regionsBySlashes(String[] grid) {

        rows = grid.length;
        cols = grid[0].length();
        int[][] expandedGrid = new int[rows*3][cols*3];
        int islandCnt = 0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i].charAt(j) == '/')
                {
                    expandedGrid[3*i+0][3*j+2] = 1;
                    expandedGrid[3*i+1][3*j+1] = 1;
                    expandedGrid[3*i+2][3*j+0] = 1;
                }
                else if(grid[i].charAt(j) == '\\')
                {
                     expandedGrid[3*i+0][3*j+0] = 1;
                     expandedGrid[3*i+1][3*j+1] = 1;
                     expandedGrid[3*i+2][3*j+2] = 1;
                }
            }
        }
        for(int i=0;i<rows*3;i++)
        {
            for(int j=0;j<cols*3;j++)
            {
                if(expandedGrid[i][j] == 0)
                {
                    expandedGrid[i][j] = -1;
                    islandCnt++;
                    floodFillIsland(expandedGrid,i,j);
                }
            }
        }
        
        // System.out.println(Arrays.deepToString(expandedGrid));
        return islandCnt;
    
    }
    public void floodFillIsland(int[][] expandedGrid,int rowNum,int colNum)
    {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{rowNum,colNum});
        expandedGrid[rowNum][colNum] = -1;
        while(!q.isEmpty())
        {
            int[] currCell = q.poll();
            for(int[] each_dir : directions)
            {
                int newRow = currCell[0] + each_dir[0];
                int newCol = currCell[1] + each_dir[1];
                if(isValidCell(newRow,newCol,rows,cols) && expandedGrid[newRow][newCol] == 0 )
                {
                    q.add(new int[]{newRow,newCol});
                    expandedGrid[newRow][newCol] = -1;
                }
            }
        }
    }
    public boolean isValidCell(int row,int col,int rowSize,int colSize)
    {
        if(row >= 0 && row < rowSize*3 && col >= 0 && col < colSize*3)
            return true;
        return false;
    }
    //BY GANESH JAGGINENI
}