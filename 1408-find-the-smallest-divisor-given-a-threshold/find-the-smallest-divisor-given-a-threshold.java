class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int max_div = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max_div)
                max_div = nums[i];
        }
        int low = 1;
        int high = max_div;
        int ans = 0;
        while(low <= high)
        {
            int mid = low+(high-low)/2;
            int calc_threshold = checkMaxDiv(nums,mid);
            if(calc_threshold <= threshold)
            {
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
               
        }
       

        return ans;
    }

    public static int checkMaxDiv(int[] nums, int divisor) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + (nums[i] + (divisor - 1)) / divisor;
        }
        return sum;
    }
    //BY GANESH JAGGINENI
}