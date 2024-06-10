class Solution {
    public int heightChecker(int[] heights) {

        int n = heights.length;
        int mismatch_idx = 0;
       int[] expected_heights = new int[n];
       for(int i=0;i<n;i++)
       {
        expected_heights[i] = heights[i];
       }
       Arrays.sort(expected_heights);
       for(int i=0;i<n;i++)
       {
        if(heights[i] != expected_heights[i])
            mismatch_idx++;
       }
       return mismatch_idx;
       

        
    }
    //BY GANESH JAGGINENI
}