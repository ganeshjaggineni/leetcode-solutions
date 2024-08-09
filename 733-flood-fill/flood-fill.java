class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int defaultColor = image[sr][sc];
        image[sr][sc] = color;
        if(defaultColor == color)
            return image;
        floodFillHelper(image,sr,sc,defaultColor,color);
        return image;
    }
    public void floodFillHelper(int[][] image,int i,int j,int defaultColor,int color)
    {
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        for(int dir=0;dir<4;dir++)
        {
            int x = i+dx[dir];
            int y = j+dy[dir];
        if(isValidBoundary(x,y,image.length,image[0].length))
        {
            if(image[x][y] == defaultColor)
            {
                image[x][y] = color;
            floodFillHelper(image,x,y,defaultColor,color);
            }
        }
        }
    }
    public boolean isValidBoundary(int x,int y,int n,int m)
    {
        if(x>= 0 && x<n && y>=0 && y<m)
            return true;
        return false;
    }
}