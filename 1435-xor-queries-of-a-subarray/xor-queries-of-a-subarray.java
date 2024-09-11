class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int[] xorArr = new int[queries.length];
        int idx = 0;
        for(int [] query : queries)
        {
            int xorResult = 0;
            for(int i=query[0];i<=query[1];i++)
            {
                xorResult = xorResult ^ arr[i];
            }
            xorArr[idx++] = xorResult;
        }
        return xorArr;
    }
}