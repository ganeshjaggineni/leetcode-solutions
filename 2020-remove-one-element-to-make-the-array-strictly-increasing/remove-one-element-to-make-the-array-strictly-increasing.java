class Solution {
    public boolean canBeIncreasing(int[] nums) {

        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            
            if(canPossible(nums,i))
                return true;
        }
        return false;
        
    }
    private static boolean canPossible(int[] arr,int idx)
    {
        System.out.println("passed idx = "+idx);
        for(int i=0;i<arr.length;i++)
        {
            if(i == idx)
            {
            // System.out.println("icx "+i);
                continue;
            }
            else if(i+1 < arr.length && i+1 == idx)
            {
                            // System.out.println("icx +1  "+(i+1));

                if(i+2 < arr.length && arr[i] >= arr[i+2])
                    return false;
            }
            else if(i+1 < arr.length && arr[i] >= arr[i+1])
            {

                // System.out.println("cehcking els if ");
                return false;
            }
        }
        return true;
    }
}