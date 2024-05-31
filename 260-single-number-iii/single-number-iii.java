class Solution {
    public int[] singleNumber(int[] nums) {
        int k = 0;
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] ==-100)
                continue;
            boolean dup = false;
            for (int j = i + 1; j < nums.length; j++)
             {
               
                    if (nums[i] == nums[j]) 
                    {
                        dup = true;
                        nums[j] = -100;
                        break;
                    }
             }
                
                if (!dup)
                    ans[k++] = nums[i];
                
            
        }
        return ans;

    }
}