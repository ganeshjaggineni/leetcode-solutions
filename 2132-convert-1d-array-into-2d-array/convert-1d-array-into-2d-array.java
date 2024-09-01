class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
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
    }
}