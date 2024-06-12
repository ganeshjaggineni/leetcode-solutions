class Solution {
    public int[] runningSum(int[] nums) {

        int n = nums.length;
        int[] prefix_sum = new int[n];
        prefix_sum[0] = nums[0];
        for(int i=1;i<n;i++)
        {
            prefix_sum[i] = prefix_sum[i-1] + nums[i];
        }
        return prefix_sum;
       
        
    }
    //BY GANESH JAGGINENI
}