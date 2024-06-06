class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
   
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == target)
                   return true;
            }

        }
        return false;
   
   
   
   
    //     for(int[] arr:matrix)
    //     {
    //         boolen res = SearchTarget(arr,target);
    //     }

    // }
    // public static boolean SearchTarget(int[] arr,int target)
    // {

    // }
    }
}