class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans1= new ArrayList<>();
         List<Integer> ans2= new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++)
        {
            boolean diff = true;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    diff = false;
                    break;
                }
            }
            if(diff && !ans1.contains(nums1[i]))
                ans1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
                boolean diff = true;
            for(int j=0;j<nums1.length;j++)
            {
                if(nums2[i] == nums1[j])
                {
                     diff = false;
                    break;
                }
            }
             if(diff && !ans2.contains(nums2[i]))
                ans2.add(nums2[i]);
        }
        list.add(ans1);
        list.add(ans2);


        
       return list; 
    }
}