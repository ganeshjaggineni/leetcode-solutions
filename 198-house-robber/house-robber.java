class Solution {
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
    //BY GANESH JAGGINENI
}