class Solution {
    public int singleNumber(int[] nums) {
        
    //     int sum = 0;
    //     Set<Integer> s = new HashSet<>();
    //     int set_sum = 0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(!s.remove(nums[i]))
    //         {
    //        s.add(nums[i]);
    //         }
    //     }
    //   return s.iterator().next();
//method 2
    // Arrays.sort(nums);
    // int index = 0;
    // System.out.println(Arrays.toString(nums));
    // for(int i=0;i<nums.length-1;i+=2)
    // {
    //     if(nums[i] != nums[i+1])
    //     {
    //        return nums[i];
    //     }
    // }
    // return nums[nums.length-1];

    //method 3 xor
    int ans = 0;
    for(int i:nums)
    {
        ans = ans^i;
    }
    return ans;
    
    }
}