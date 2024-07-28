class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int smallestNum = nums[0];
        int largestNum = nums[n-1];
        int greatestCommDiv = 0;
        for(int i=1;i<=largestNum;i++)
        {
            if(smallestNum%i == 0 && largestNum%i == 0)
            {
                greatestCommDiv = i;
            }
        }
        return greatestCommDiv;
        
    }
    //BY GANESH JAGGINENI
}