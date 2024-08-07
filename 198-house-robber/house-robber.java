class Solution {
    /*
            METHOD 1 : MEMOIZATION
    static int dp[];
    public int rob(int[] nums) {
        int i = 0;
        dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return robHelper(i,nums);
    }
    public static int robHelper(int i,int[] nums)
    {
        if(i >= nums.length)
            return 0;
        if(dp[i] != -1)
            return dp[i];
        int robHouse = nums[i] + robHelper(i+2,nums);
        int skipHouse = robHelper(i+1,nums);
        return dp[i] = Math.max(robHouse,skipHouse);
    }
    */

    //METHOD 2 TABULATION
      static int dp[];
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        dp[2] = Math.max(nums[0],nums[1]);

        for(int i=3;i<=nums.length;i++)
        {
            dp[i] = Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
        return dp[nums.length];
        
        
    }
   
    //BY GANESH JAGGINENI
}