class Pair
{
    int  first;
    int  second;
    Pair(int first,int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
     private static int dir[][] = {{-1,0},{0,1},{1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == '1' )
                {
                    grid[i][j] = '*';
                    numIslandsHelper(grid,i,j);
                    count++;
                    
                }
            }
        }
        return count;
    }
    public void numIslandsHelper(char[][] grid,int row,int col)
    {
       
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        
            
            while(!q.isEmpty())
            {
                Pair newCell = q.poll();
                for(int[] each_dir : dir)
                {
                    int newRow = newCell.first + each_dir[0];
                    int newCol = newCell.second + each_dir[1];
                    if(isValid(newRow,newCol,grid.length,grid[0].length) && grid[newRow][newCol] != '*' && grid[newRow][newCol] != '0' )
                    {
                        q.add(new Pair(newRow,newCol));
                        grid[newRow][newCol] = '*';
                        
                    }
                }
            }
            
    }
        public static boolean isValid(int row,int col,int m,int n)
        {
            if(row >= 0 && row < m && col >= 0 && col< n)
                return true;
            return false;
        }
        //BY GANESH JAGGINENI
    
}