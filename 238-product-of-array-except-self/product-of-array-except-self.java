
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        int zero_count = 0;
        int zero_idx = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0)
                prod = prod * nums[i];
            else {
                zero_count++;
                zero_idx = i;
            }

        }
        if (zero_count == 1)
            ans[zero_idx] = prod;
        else if (zero_count > 1) {
            return ans;
        } else {
            for (int i = 0; i < n; i++) {
                ans[i] = prod / nums[i];
            }
        }

        return ans;
    }
    //BY GANESH JAGGINENI
}