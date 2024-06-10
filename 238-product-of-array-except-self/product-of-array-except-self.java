
class Solution {
    public int[] productExceptSelf(int[] nums) {

        /*
        int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        int zero_count = 0;
        int zero_idx = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0)
                prod = prod * nums[i];
            else {
                zero_count++;
                zero_idx = i;
            }

        }
        if (zero_count == 1)
            ans[zero_idx] = prod;
        else if (zero_count > 1) {
            return ans;
        } else {
            for (int i = 0; i < n; i++) {
                ans[i] = prod / nums[i];
            }
        }

        return ans;
        */


        //prefix product and suffix product method
        //prefix product calculation
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int[] ans = new int[n];
        pre[0] = nums[0];
        for(int i=1;i<n;i++)
        {
            pre[i] = pre[i-1]*nums[i];
        }
        suf[n-1] = nums[n-1];
         for(int i=n-2;i>=0;i--)
        {
            suf[i] = suf[i+1]*nums[i];
        }
        System.out.println(Arrays.toString(pre));
         System.out.println(Arrays.toString(suf));
         ans[0] = suf[1];
         ans[n-1] = pre[n-2];
         for(int i=1;i<n-1;i++)
         {
            ans[i] = pre[i-1]*suf[i+1];
         }
         return ans;
    }
    //BY GANESH JAGGINENI
}