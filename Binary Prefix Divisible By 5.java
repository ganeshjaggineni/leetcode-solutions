class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
           sum = ((sum<<1)+nums[i])%10;
          res.add(sum==0 || sum==5);
        }
        return res;
        
    }
}
