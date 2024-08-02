class Solution {
    public int climbStairs(int n) {

        int[] dpStairs = new int[n+1];
        dpStairs[0] = 1;
        dpStairs[1] = 1;
        // dp[2] = 2;
        for(int i=2;i<=n;i++)
        {
            dpStairs[i] = dpStairs[i-1]+dpStairs[i-2];
        }
        return dpStairs[n];
        
    }
    //BY GANESH JAGGINENI
}