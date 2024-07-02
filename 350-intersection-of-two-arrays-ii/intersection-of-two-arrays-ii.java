class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
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
    }
    //BY GANESH JAGGINENI
}