class Solution {
    public boolean containsDuplicate(int[] nums) {

        // int n = nums.length;
        // Arrays.sort(nums);
        // for (int i = 0; i < n - 1; i++) {

        //     if (nums[i] == nums[i + 1])
        //         return true;

        // }
        // return false;

        Set<Integer> nums_set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums_set.contains(nums[i]))
                return true;
            nums_set.add(nums[i]);
        }
        return false;

    }
    // BY GANESH JAGGINENI
}