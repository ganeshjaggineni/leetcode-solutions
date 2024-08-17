class Solution {
    public long maxPoints(int[][] points) {
        
        int rows = points.length;
        int cols = points[0].length;

        long[] prevRows = new long[cols];

        for(int i=0;i<cols;i++)
        {
            prevRows[i] = points[0][i];
        }

        for(int row = 0;row < rows-1;row++)
        {
            long[] leftArr = new long[cols];
            long[] rightArr = new long[cols];
            long[] currRow = new long[cols];

            leftArr[0] = prevRows[0];
            for(int col = 1;col < cols;col++)
            {
                leftArr[col] = Math.max(prevRows[col],leftArr[col-1]-1);
            }
             rightArr[cols-1]= prevRows[cols-1];

            for(int col=cols-2;col>=0;col--)
            {
                rightArr[col] = Math.max(prevRows[col],rightArr[col+1]-1);
            }

            for(int col=0;col<cols;col++)
            {
                currRow[col] = Math.max(leftArr[col],rightArr[col])+points[row+1][col];
            }
            prevRows = currRow;
        }
        long maxiPnts = 0;
        for(int i=0;i<cols;i++)
        {
            maxiPnts = Math.max(maxiPnts,prevRows[i]);
        }
        return maxiPnts;
    }
}