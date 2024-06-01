class Solution {
    public int countNegatives(int[][] grid) {
        int row_len = grid.length;
        int col_len = grid[0].length;
        int neg_count = 0;
        for (int[] eachrow : grid) {
            for (int j = 0; j < col_len; j++) {
                if (eachrow[j] < 0)
                    neg_count++;
            }
        }
        return neg_count;
    }
    // BY GANESH JAGGINENI
}