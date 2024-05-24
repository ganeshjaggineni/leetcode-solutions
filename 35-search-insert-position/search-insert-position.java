class Solution {
    public int searchInsert(int[] nums, int target) {

       int floor_bin_index =  findFloorBinIndex(nums,target);
       return floor_bin_index;
        
    }
    public static int findFloorBinIndex(int[] nums,int target)
    {
        int low = 0,high = nums.length-1,index = -1;
        if(target>nums[high])
            return nums.length;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(target<=nums[mid])
            {
                high = mid-1;
                index = mid;
            }
            else
                low = mid+1;
        }
        return (index==-1)?low:index;
    }
}