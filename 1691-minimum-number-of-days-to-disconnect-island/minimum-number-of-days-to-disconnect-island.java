class Solution {
    private int[][] dir = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

    public int minDays(int[][] grid) {

        int initialIslandsCnt = cntIslands(grid);
        if (initialIslandsCnt != 1) {
            return 0;// 0 min days required
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0)
                    continue;

                grid[i][j] = 0;// temp change to water to find if ther is no land in this coordiantes then the
                               // island may be divided to 2 islands
                if (cntIslands(grid) != 1) {
                    return 1;// if islands are not 1 then the change in this cell makes islands to divided
                             // into 2 parts
                }

                grid[i][j] = 1; // if return stmt not execute then change in cell can't divide islands into 2
            }
        }
        return 2;// if any cell can't divide islands into 2 then there is a gurantee that 2 cells
                 // convert into water definitely divide islands into 2
        // if minday != 1 then just 2 days require to divide

    }

    public int cntIslands(int[][] grid) {
        int noOfIslands = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    noOfIslands++;
                    exploreIsland(grid, i, j, visited);// dfs call
                }
            }
        }
        return noOfIslands;
    }

    public void exploreIsland(int[][] grid, int row, int col, boolean[][] visited) {
        visited[row][col] = true;
        for (int[] each_dir : dir) {
            int newRow = row + each_dir[0];
            int newCol = col + each_dir[1];
            if (isValidCell(newRow, newCol, grid.length, grid[0].length) && !visited[newRow][newCol]
                    && grid[newRow][newCol] == 1) {
                exploreIsland(grid, newRow, newCol, visited);
            }
        }
    }

    public static boolean isValidCell(int row, int col, int rowSize, int colSize) {
        if (row >= 0 && row < rowSize && col >= 0 && col < colSize)
            return true;
        return false;
    }
}