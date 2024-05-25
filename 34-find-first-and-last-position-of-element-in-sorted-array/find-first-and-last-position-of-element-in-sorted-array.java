class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first_occurence = floorBinSearch(nums,target);
        int last_occurence = ceilBinSearch(nums,target);

        return new int[]{first_occurence,last_occurence};
        
    }
    public static int floorBinSearch(int[] nums,int target)
    {
        int low = 0;
        int high = nums.length-1;
        int first_index = -1;
        int mid = 0;
        System.out.println("first at low "+low);
         System.out.println("first at high ="+high);
        while(low <= high)
        {
            mid = (low+high)/2;
            if(target == nums[mid])
            {
                 first_index = mid;
                   high = mid-1;
                   System.out.println("mid = "+mid);
                       System.out.println("low"+low);
                   System.out.println("high"+high);
                   System.out.println("first"+first_index);

            }
            else if(target < nums[mid])
            {
                high = mid - 1;  
            }
            else
                low = mid+1;
              
            
        }
        return first_index;
    }

    public static int ceilBinSearch(int[] nums,int target)
    {
        int low = 0;
        int high = nums.length-1;
        int last_index = -1;
        int mid = 0;
        while(low <= high)
        {
            mid = (low+high)/2;
             if(target == nums[mid])
            {
                last_index = mid;
                low = mid+1;
            }
            else if(target > nums[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return last_index;
    }
    //BY GANESH JAGGINENI
}