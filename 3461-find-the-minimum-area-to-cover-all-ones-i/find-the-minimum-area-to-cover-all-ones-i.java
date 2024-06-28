class Solution {
    public int minimumArea(int[][] grid) {
        int len_start_point = -1, len_end_point = -1;
        int breadth_start_point = -1, breadth_end_point = -1;
        int row_len = grid.length;
        int col_len = grid[0].length;
        
        // Find len_start_point
        for (int i = 0; i < row_len; i++) {
            boolean found = false;
            for (int j = 0; j < col_len; j++) {
                if (grid[i][j] == 1) {
                    len_start_point = i;
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        
        // Find len_end_point
        for (int i = row_len - 1; i >= 0; i--) {
            boolean found = false;
            for (int j = col_len - 1; j >= 0; j--) {
                if (grid[i][j] == 1) {
                    len_end_point = i;
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        
        // Find breadth_start_point
        for (int j = 0; j < col_len; j++) {
            boolean found = false;
            for (int i = 0; i < row_len; i++) {
                if (grid[i][j] == 1) {
                    breadth_start_point = j;
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        
        // Find breadth_end_point
        for (int j = col_len - 1; j >= 0; j--) {
            boolean found = false;
            for (int i = row_len - 1; i >= 0; i--) {
                if (grid[i][j] == 1) {
                    breadth_end_point = j;
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        
        return (len_end_point - len_start_point + 1) * (breadth_end_point - breadth_start_point + 1);
    }
    //BY GANESH JAGGINENI
}