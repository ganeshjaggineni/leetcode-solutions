class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high)
        {

            int mid = low + (high-low)/2;
            if(nums[mid] == target)
                return true;
            else if(nums[low] == nums[mid] && nums[mid] == nums[high])
            {
                low++;
                high--;
                continue;
            }
            //find if left part is sorted
            else if(nums[low] <= nums[mid])
            {
                //check if element is present
                if(nums[low]<= target && nums[mid] >= target)
                {
                    high = mid-1;
                }
                else
                    low = mid + 1;
            }
            else //then definitely right part is sorted
            {
                //check if element is present in right part
                if(nums[mid] <= target & nums[high] >= target)
                {
                    low = mid + 1;
                }
                else
                    high = mid - 1;
            }
        }
        return false;
    }
        //BY GANESH JAGGINENI
}