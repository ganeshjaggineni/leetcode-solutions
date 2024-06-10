class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        int zero_count = 0;
        int zc_idx = 0;
        boolean found = false;
        for(int i=0;i<n;i++)
        { 
                    if(nums[i] != 0)
                             prod = prod*nums[i];
                    if(nums[i] == 0)
                        zero_count++;

                    if(!found)
                    {
                    if(zero_count == 1)
                    {
                        zc_idx = i;
                        found = true;
                        System.out.println(zc_idx);
                    }
                    }
        }
        if(zero_count  == 1)
            ans[zc_idx] = prod;
        else if(zero_count > 1)
        {
            return ans;
        }
        else
        {
         for(int i=0;i<n;i++)
        { 
                   ans[i] = prod/nums[i];
        }
        }
        
        
        return ans;
    }
}