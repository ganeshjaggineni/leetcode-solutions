class Solution {
    public int maximumCount(int[] nums) {

        int pos = 0;
        int neg = 0;
        int len = nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i] < 0)
                neg++;
            else if(nums[i] > 0)
                pos++;
        }
        return Math.max(pos,neg);
        
    }
    //BY GANESH JAGGINENI
}