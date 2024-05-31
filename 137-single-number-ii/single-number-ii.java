class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) != 0) {
                    sum = sum + 1;
                }

            }
            if (sum % 3 != 0)
                ans = ans | (1 << i);
        }
        return ans;

    }
    // BY GANESH JAGGINENI

}