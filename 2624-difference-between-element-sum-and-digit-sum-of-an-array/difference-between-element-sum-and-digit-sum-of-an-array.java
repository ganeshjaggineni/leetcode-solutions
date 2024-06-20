class Solution {
    public int differenceOfSum(int[] nums) {
        
        int element_sum = 0;
        int digit_sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            element_sum += nums[i];
            digit_sum += calcDigitSum(nums[i]);
        }
        return Math.abs(element_sum - digit_sum);
    }
    private static int calcDigitSum(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            int last_digit = n%10;
            sum += last_digit;
            n /= 10;
        }
        return sum;
    }
}