class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> s1 = new HashSet<>();
         Set<Integer> res_set = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            s1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(s1.contains(nums2[i]))
                res_set.add(nums2[i]);
        }

        // for(int val:s1)
        //     System.out.println(val);

        // Iterator<Integer> iterator = res_set.iterator();
        // while(iterator.hasNext())
        // {
        //     System.out.println(iterator.next());
        // }
      int[] ans = new int[res_set.size()];
      int index = 0;
      for(int num:res_set)
      {
        ans[index++] = num;
      }
        return ans;
    }
}