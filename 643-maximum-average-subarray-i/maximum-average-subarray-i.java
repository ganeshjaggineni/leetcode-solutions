class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int i = 0;
        int j = 0;
        int sum = 0;
        double avg = 0.0;
        double Max_avg = Double.NEGATIVE_INFINITY;

        while (j < nums.length) {
            sum = sum + nums[j];
            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                avg = (double) sum / k;
                Max_avg = Math.max(Max_avg, avg);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return Max_avg;

    }
}