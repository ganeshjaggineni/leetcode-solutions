class Solution {
    public List<List<Integer>> subsets(int[] nums) {
           List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<(1<<nums.length);i++)
        {
                        List<Integer> res = new ArrayList<>();

            int temp = i;
            int j = nums.length-1;
            while(temp >0)
            {
                if((temp&1)==1 )
                    res.add(nums[j]);
                temp = temp>>1;
                j--;
                
            }
            ans.add(res);
        }
        return ans;
    }
}
