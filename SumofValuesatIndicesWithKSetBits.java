class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

    // int arr[] = new int[nums.size()];
   
    int sum = 0;
    int countcheckbits = 0;
        for(int i=0;i<nums.size();i++)
        {
            countcheckbits = checkSetBits(i);
             if(countcheckbits==k)
                sum += nums.get(i);
            
        }
    
        // for(int j=0;j<arr.length;j++)
        // {
        //     if(arr[j] == k)
        //         sum = sum+nums.get(j);
        // }
        return sum;

        
    }
    public int  checkSetBits(int num)
    {
        int count = 0;
        while(num > 0)
        {
        if((num & 1)==1)
            count++;
        num >>= 1;
        
        }
        return count;
    }
}
