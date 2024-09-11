class Solution {
    public int longestSubarray(int[] nums) {
        
        int maxBitAnd = Integer.MIN_VALUE;
        int longSubArr = 0;
        int currLen = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            maxBitAnd = Math.max(nums[i],maxBitAnd);
        }
        int j = 0;
        while(j<n)
        {
            if(nums[j] == maxBitAnd)
            {
                currLen++;
                longSubArr = Math.max(longSubArr,currLen);
            }
            else
                currLen = 0;
            j++;
            
        }
        return longSubArr;
    }
}