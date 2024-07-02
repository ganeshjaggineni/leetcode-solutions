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

    }
    //BY GANESH JAGGINENI
}