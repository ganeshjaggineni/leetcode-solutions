class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

       //method 1 : Extreme stimulation
       /* 
        int[][] res = new int[m][n];
        int row = 0;
        int currIdx = 0;
        if(original.length != m*n)
            return new int[][]{};
        while(currIdx < original.length)
        {
            for(int i=0;i<=n-1;i++)
            {
                res[row][i] = original[currIdx++]; 
            }
            row++;
            for(int i=n;i<=2*n-1 && row<m;i++)
            {
                res[row][i-n] = original[currIdx++]; 
            }
            row++;
        }
        return res;
        */

        //method 2 : simulation || logical iterating
        if(m*n != original.length)
            return new int[][]{};
        int currIdx = 0;
        int[][] resMat = new int[m][n];
        for(int row = 0;row < m; row++)
        {
            for(int col = 0;col<n;col++)
            {
                resMat[row][col] = original[currIdx++];
            }
        }
        return resMat;
    }
}