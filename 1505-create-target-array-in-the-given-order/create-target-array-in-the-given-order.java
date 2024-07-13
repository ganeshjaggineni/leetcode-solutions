class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> target_list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            target_list.add(index[i],nums[i]);
        }
        int[] ans = new int[target_list.size()];
        for(int i=0;i<target_list.size();i++)
        {
            ans[i] = target_list.get(i);
        }
        return ans;
        
    }
}