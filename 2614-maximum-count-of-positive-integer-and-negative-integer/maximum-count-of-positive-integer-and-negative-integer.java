class Solution {
    public int maximumCount(int[] nums) {

        // int pos = 0;
        // int neg = 0;
        // int len = nums.length;
        // for(int i=0;i<len;i++)
        // {
        //     if(nums[i] < 0)
        //         neg++;
        //     else if(nums[i] > 0)
        //         pos++;
        // }
        // return Math.max(pos,neg);


        int pos_ind = firstPosNum(nums);
        int neg_ind = lastNegNum(nums);
        // System.out.println("pos = "+pos_ind+" neg ind = "+neg_ind);

        return Math.max(pos_ind,neg_ind);
        
    }
    public static int firstPosNum(int[] nums)
    {
        int low = 0;
        int len = nums.length;
        int high = len-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] <= 0)
                low = mid+1;
            else if(nums[mid] > 0)
                high = mid-1;
        }
        return len-low;
    }


      public static int lastNegNum(int[] nums)
    {
        int low = 0;
        int len = nums.length;
        int high = len-1;
        while(low <= high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid] < 0)
                low = mid+1;
            else 
                high = mid-1;
        }
        return low;
    }


    //BY GANESH JAGGINENI
}