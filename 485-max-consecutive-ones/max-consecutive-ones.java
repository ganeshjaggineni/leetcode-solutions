class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int ans = 0;
        int count = 0;

        if (nums.length == 1)
            return nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count++;
          
            else
                count = 0;
            ans = Math.max(ans, count);
        }
        return ans;

    }
    //BY GANESH JAGGINENI
}