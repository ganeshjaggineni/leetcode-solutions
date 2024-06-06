class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int start_capacity = 0;
        int end_capacity = 0;
        for (int i = 0; i < weights.length; i++) {
            start_capacity = Math.max(start_capacity, weights[i]);
            end_capacity += weights[i];
        }
        int ans = 0;
        while (start_capacity <= end_capacity) {
            int mid_capacity = start_capacity + (end_capacity - start_capacity) / 2;
            int calc_days = findShipmentDays(weights, mid_capacity);
            if (calc_days <= days) {
                ans = mid_capacity;
                end_capacity = mid_capacity - 1;
            } else
                start_capacity = mid_capacity + 1;
        }

        return ans;
    }

    public static int findShipmentDays(int[] weights, int mid_capacity) {
        int days = 0;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] <= mid_capacity) {
                sum += weights[i];

            } else {
                sum = weights[i];
                days++;
            }
        }
        days++;
        return days;
    }
    // BY GANESH JAGGINENI
}