class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] ans = new int[arr1.length];
        int max = Integer.MIN_VALUE;
        int len1 = arr1.length;
        // int zero_cnt = 0;
        for(int i=0;i<len1;i++)
        {
            if(arr1[i] > max)
                max = arr1[i];

            // if(arr1[i] == 0)
            //     zero_cnt++;
        }
        int[] cnt = new int[max+1];
    
        int len2 = arr2.length;
        for(int i=0;i<len1;i++)
        {
            cnt[arr1[i]]++;
        }
        System.out.println(Arrays.toString(cnt));
        int idx = 0;
        for(int i=0;i<len2;i++)
        {
            int x = cnt[arr2[i]];
            while(x-- > 0)
            {
                ans[idx++] = arr2[i];
            }
            cnt[arr2[i]] = 0;
        }
        // if(zero_cnt > 1)
        // {
        //     while(zero_cnt-- >0)
        //     {
        //         ans[idx++] = 0;
        //     }
        // }
        for(int i=0;i<=max;i++)
        {
            while(cnt[i]-- > 0)
            {
                ans[idx++] = i;
            }
        }
        
        System.out.println(Arrays.toString(ans));
        
        return ans;
        
    }
}