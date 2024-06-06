class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // for(int i=0;i<matrix.length;i++)
        // {
        // for(int j=0;j<matrix[0].length;j++)
        // {
        // if(matrix[i][j] == target)
        // return true;
        // }

        // }
        // return false;

        for (int[] arr : matrix) {
            int len = arr.length;
            if (arr[0] <= target && arr[len - 1] >= target) {
                boolean res = SearchTarget(arr, target);
                if (res)
                    return true;

            }
        }
        return false;

    }

    public static boolean SearchTarget(int[] arr, int target) {
        int len = arr.length;
        int low = 0;
        System.out.println(Arrays.toString(arr));
        int high = len - 1;
        while (low <= high) {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    return true;
                } else if (arr[mid] > target)
                    high = mid - 1;
                else
                    low = mid + 1;

            }
        }
        return false;

    }
    // BY GANESH JAGGINENI

}