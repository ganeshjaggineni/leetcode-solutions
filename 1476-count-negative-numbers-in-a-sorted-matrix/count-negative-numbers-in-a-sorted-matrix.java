class Solution {
    public int countNegatives(int[][] grid) {
        //METHOD 1 -> BRUTE-FORCE APPROACH
        // int row_len = grid.length;
        // int col_len = grid[0].length;
        // int neg_count = 0;
        // for (int[] eachrow : grid) {
        // for (int j = 0; j < col_len; j++) {
        // if (eachrow[j] < 0)
        // neg_count++;
        // }
        // }
        // return neg_count;

    //METHOD 2 -> BINARY-SEARCH APPROACH
        int row_len = grid.length;
        int col_len = grid[0].length;
        int negnum_count = 0;
        for (int[] eachrow : grid) {
            negnum_count += negBinFloorSearch(eachrow);
        }
        return negnum_count;
    }

    public static int negBinFloorSearch(int[] eachrow) {
        int low = 0;
        int high = eachrow.length - 1;
        int neg_ele_ind = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (eachrow[mid] >= 0)
                low = mid + 1;
            else if (eachrow[mid] < 0) {
                neg_ele_ind = mid;
                high = mid - 1;
            }
        }
        return (neg_ele_ind >= 0) ? (eachrow.length - neg_ele_ind) : 0;
    }
    // BY GANESH JAGGINENI
}