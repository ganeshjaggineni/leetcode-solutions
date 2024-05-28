class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans_list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                ans_list.add(i);
        }
        return ans_list;
        
    }
}