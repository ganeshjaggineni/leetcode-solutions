class Solution {
    public int subsetXORSum(int[] nums) {

        int subset_sum = 0,total_sum = 0;
        int n = nums.length;
       for(int i=0;i<(1<<n);i++)
       {
        subset_sum = 0;
        for(int j=0;j<n;j++)
        {
            if(checkBit(i,j))
            {
                subset_sum = subset_sum^nums[j];
            }
        }
        total_sum = total_sum+subset_sum;
       } 
       return total_sum;
        
    }
   public static boolean checkBit(int n,int pos)
    {
        n = n>>pos;
        if((n&1) == 1)
            return true;
        return false;
        // if((n&(1<<pos)) != 0)
        //     return true;
        // return false;
    }
}