class Solution {
    public int countPairs(List<Integer> nums, int target) {
            //bruteforce solution
        // int count = 0;
        // for(int i=0;i<nums.size();i++)
        // {
        //     for(int j=i+1;j<nums.size();j++)
        //     {
        //         if(nums.get(i)+nums.get(j)<target)
        //             count++;
        //     }
        // }
        // return count;
        
    
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