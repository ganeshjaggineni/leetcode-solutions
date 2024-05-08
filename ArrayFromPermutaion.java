class Solution {
    public int[] buildArray(int[] nums) {

        Scanner sc = new Scanner(System.in);
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {

           ans[i] = nums[nums[i]];
        }
        return ans;
    
}
}