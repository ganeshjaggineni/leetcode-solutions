class Solution {
    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean rows_zeros[] = new boolean[rows];
        boolean cols_zeros[] = new boolean[cols];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows_zeros[i] = true;
                    cols_zeros[j] = true;
                }
            }
        }
           for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(rows_zeros[i] || cols_zeros[j])
                {
                    matrix[i][j]=0;
                }
            }
        }
         
    }
}