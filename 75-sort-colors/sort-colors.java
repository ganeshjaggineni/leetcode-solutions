class Solution {
    public void sortColors(int[] nums) {

        // DUTCH NATIONAL FLAG ALGORITHM
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap a[low],a[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1)
                mid++;
            else // a[mid] == 2
            {
                // swap a[mid],a[high]
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

        /*
         * //two pass algorithm
         * int zeros_count = 0, ones_count = 0, twos_count = 0;
         * int len = nums.length;
         * //FIRST PASS : count the number of 0's,1's,2's
         * for (int i = 0; i < len; i++) {
         * if (nums[i] == 0)
         * zeros_count++;
         * else if (nums[i] == 1)
         * ones_count++;
         * else if (nums[i] == 2)
         * twos_count++;
         * }
         * //SECOND PASS : overwrite the array with counted 0's,1's and 2's count
         * int i = 0;
         * while (zeros_count-- > 0)
         * nums[i++] = 0;
         * while (ones_count-- > 0)
         * nums[i++] = 1;
         * while (twos_count-- > 0)
         * nums[i++] = 2;
         * 
         * 
         */

    }
    // BY GANESH JAGGINENI
}