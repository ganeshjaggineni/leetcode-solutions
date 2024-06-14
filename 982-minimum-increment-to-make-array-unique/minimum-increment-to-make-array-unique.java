class Solution {
    public int minIncrementForUnique(int[] nums) {

        Arrays.sort(nums);
        int moves = 0;
        int diff = 0;
        for(int i=1;i<nums.length;i++)
        {
        if(nums[i] <= nums[i-1])
        {
            diff = nums[i-1]-nums[i]+1;
            nums[i] += diff;
            moves += diff;
        }
        }

        return moves;
        
    }
}