class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

       //METHOD 1 BRUTEFORCE
       /* 
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                   res.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            ans[i] = res.get(i);
        }
        return ans;
        */

/*
        //METHOD 2 TWO POINTERS
        
        int p1 = 0;
        int p2 = 0;
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(p1 < nums1.length && p2 <nums2.length)
        {
            if(nums1[p1] == nums2[p2])
            {
                res.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1] < nums2[p2])
            {
                p1++;
            }
            else
                p2++;
        }
         int[] intersection = new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            intersection[i] = res.get(i);
        }
        return intersection;
*/

    //method 3 BINARY SEARCH

        if(nums2.length < nums1.length)
        {
               return  performOperation(nums2,nums1);
        }
        else
        {
           return performOperation(nums1,nums2);
        }



    }
    public static int[] performOperation(int[] nums1,int[] nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res_list = new ArrayList<>();
        int prev_idx = -1;
        // int ret_idx = -1;
        for(int i=0;i<nums1.length;i++)
        {
            
           int ret_idx =  binSearch(nums2,nums1[i],prev_idx+1);
           if(ret_idx != -1)
           {
             res_list.add(nums1[i]);
             prev_idx = ret_idx;
           }
        }
        int[] intersection = new int[res_list.size()];
         for(int i=0;i<res_list.size();i++)
        {
            intersection[i] = res_list.get(i);
        }
        return intersection;
    }
    public static int binSearch(int[] nums,int target,int start)
    {
        int low = start;
        int high = nums.length-1;
        int ans = -1;
        while(low <= high)
        {
            int mid = (low +(high-low)/2);
            if(nums[mid] == target)
            {
                ans =  mid;
                high = mid-1;

            }
            else if(nums[mid] < target)
            {
                low = mid+1;
            }
            else
                high = mid-1;
        }
        return ans;
    }
    //BY GANESH JAGGINENI
}