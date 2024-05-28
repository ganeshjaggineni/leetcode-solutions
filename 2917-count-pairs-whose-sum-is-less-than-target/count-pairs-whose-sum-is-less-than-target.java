class Solution {
    public int countPairs(List<Integer> nums, int target) {
       
    
    int left = 0;
    int right = nums.size()-1;
    int count = 0;
    Collections.sort(nums);
   
    while(left<right)
    {
        int sum = nums.get(left)+nums.get(right);
        if(sum <target)
        {
            count += right-left;
            left++;
        }
        else if(sum >= target)
            right--;
    }
    return count;
    //BY GANESH JAGGINENI
    
}
}