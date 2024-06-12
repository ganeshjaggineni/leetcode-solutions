class Solution {
    public void sortColors(int[] nums) {

        int zeros_count = 0, ones_count = 0, twos_count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0)
                zeros_count++;
            if (nums[i] == 1)
                ones_count++;
            if (nums[i] == 2)
                twos_count++;
        }

        int i = 0;
        while (zeros_count-- > 0)
            nums[i++] = 0;
        while (ones_count-- > 0)
            nums[i++] = 1;
        while (twos_count-- > 0)
            nums[i++] = 2;

      

    }
    // BY GANESH JAGGINENI
}