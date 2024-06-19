class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        if (m * k > n)
            return -1;
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_val = Math.max(max_val, bloomDay[i]);
        }

        int low = 1;
        int high = max_val;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (MakeBoquets(mid, bloomDay, k, m)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean MakeBoquets(int day, int[] bloomDay, int k, int m) {
        int flower = 0;
        int boquet = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                flower++;
                if (flower == k) {
                    boquet++;
                    flower = 0;
                }
            } else
                flower = 0;

        }

        return boquet >= m;

    }
    //BY GANESH JAGGINENI

}