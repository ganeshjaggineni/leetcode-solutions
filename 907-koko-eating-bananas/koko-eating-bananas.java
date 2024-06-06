class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int len = piles.length;
        int max_piles = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (piles[i] > max_piles)
                max_piles = piles[i];
        }
        int low = 1;
        int high = max_piles;
        int res = max_piles;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long ans = eatBananas(piles, mid);
            if (ans <= h) {
                res = mid;
                high = mid - 1;
            } else
                low = mid + 1;

        }

        return res;
    }

    public static long eatBananas(int[] piles, int k) {
        long value = 0;
        for (int i = 0; i < piles.length; i++) {
            // value += (int) Math.ceil((double) piles[i] / k);
             value += (piles[i] + k - 1) / k;
        }
        return value;
    }
    // BY GANESH JAGGINENI
}