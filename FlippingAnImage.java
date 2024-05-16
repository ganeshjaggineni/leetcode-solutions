class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        // for(int i=0;i<image.length;i++)
        // {
           
        //         int slow = 0;
        //         int fast = image[i].length-1;
        //         // System.out.println(image[0].length);
        //         // System.out.println(fast);
        //         int temp = 0;
        //         while(slow<=fast)
        //         {
        //             temp = image[i][fast];
        //            image[i][fast] = image[i][slow];
        //             image[i][slow] = temp;
        //             slow++;
        //             fast--;
        //         }
            
        // }
        // System.out.println("array"+Arrays.deepToString(image));
        // for(int i=0;i<image.length;i++)
        // {
        //     for(int j=0;j<image[0].length;j++)
        //     {
        //         if(image[i][j] == 1)
        //             image[i][j] = 0;
        //         else if(image[i][j] == 0)
        //             image[i][j] = 1;
        //     }
        // }
        // return image;


        for(int i=0;i<image.length;i++)
        {
            int left = 0;
            int right = image[i].length-1;
            int temp = 0;
            while(left<=right)
            {
                temp  = image[i][left]^1;
                image[i][left] = image[i][right]^1;
                image[i][right] = temp; 
                left++;
                right--;
            }
        }
        return image;
    }
}
