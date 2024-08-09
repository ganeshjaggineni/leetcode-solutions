class Solution {
    public int numMagicSquaresInside(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int magicSqr = 0;
        for(int i=0;i+2<rows;i++)
        {
            for(int j=0;j+2<cols;j++)
            {
                if(checkIsMagicSquare(i,j,grid))
                {
                    magicSqr++;
                }
            }
        }
        return magicSqr;
    }
    public static boolean checkIsMagicSquare(int startRow,int startCol,int[][] grid)
    {
        // System.out.println("passed strtrow +"+startRow+" start col "+startCol);
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        boolean[] visited = new boolean[10];

        int diag1=0,diag2=0;
        int rowIdx = 0;
        for(int i=startRow;i<=startRow+2;i++)
        {
            for(int j=startCol;j<=startCol+2;j++)
            {
                if(grid[i][j] > 0 && grid[i][j] < 10)
                {
                visited[grid[i][j]] = true;
                }
                rowSum[rowIdx] = rowSum[rowIdx]+grid[i][j];
                if(i-startRow == j-startCol)
                    diag1 += grid[i][j];
                if((i-startRow) + (j-startCol) == 2)
                    diag2 += grid[i][j];
            }
            rowIdx++;
        }
        // System.out.println("rowsum 0"+rowSum[0] + "rowsum[1]"+rowSum[1]+"rowsum2"+rowSum[2]);
        // System.out.println("diag 1 = "+diag1+" diag2 = "+diag2);
        if(rowSum[0] != rowSum[1] || rowSum[0] != rowSum[2] || diag1 != diag2)
            return false;
        int colIdx = 0;
        for(int j=startCol;j<=startCol+2;j++)
        {
            for(int i=startRow;i<=startRow+2;i++)
            {
                colSum[colIdx] = colSum[colIdx]+grid[i][j];
            }
            colIdx++;
        }
        // System.out.println("colsum 0"+colSum[0] + "colsum[1]"+colSum[1]+"colsum2"+colSum[2]);

        if(colSum[0] != colSum[1] || colSum[0] != colSum[2])
            return false;
        for(int i=1;i<10;i++)
        {
            if(!visited[i])
                return false;
        }
        return true;

    
}
}