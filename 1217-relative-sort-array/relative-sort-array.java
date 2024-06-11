class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] ans = new int[arr1.length];
        int max = Integer.MIN_VALUE;
        int len1 = arr1.length;
        for (int i = 0; i < len1; i++) {
            if (arr1[i] > max)
                max = arr1[i];

        }
        int[] cnt = new int[max + 1];

        int len2 = arr2.length;
        for (int i = 0; i < len1; i++) {
            cnt[arr1[i]]++;
        }
        int idx = 0;
        for (int i = 0; i < len2; i++) {
            int x = cnt[arr2[i]];
            while (x-- > 0) {
                ans[idx++] = arr2[i];
            }
            cnt[arr2[i]] = 0;
        }

        for (int i = 0; i <= max; i++) {
            while (cnt[i]-- > 0) {
                ans[idx++] = i;
            }
        }

        return ans;

    }
    //BY GANESH JAGGINENI
}