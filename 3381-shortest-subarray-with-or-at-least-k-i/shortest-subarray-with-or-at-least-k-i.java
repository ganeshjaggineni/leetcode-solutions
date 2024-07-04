class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {

        int minLen = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(checkSpecialSubArr(i,j,k,nums))
                    minLen = Math.min(minLen,j-i+1);
            }
        }
        return (minLen == Integer.MAX_VALUE)?-1:minLen;
        
    }
    public static boolean checkSpecialSubArr(int i,int j,int k,int[] arr)
    {
        int ans = 0;
        for(int val=i;val<=j;val++)
        {
            ans = ans | arr[val];
        }
        if(ans >= k)
            return true;

      return false;
    }
}