class Solution {
    public int subsetXORSum(int[] nums) {

        int subset_sum = 0,total_sum = 0;
        int n = nums.length;
       for(int i=0;i<(1<<n);i++)//1<<n = Math.pow(2,n)
       {
        subset_sum = 0;
        for(int j=0;j<n;j++) 
        {
            if(checkBit(i,j))//if bit at jth position is set then we can take the value and form a subset
            {                       //Ex:1 binary value =001 show we should take the value at j = 3 which is {arr[3]}
                subset_sum = subset_sum^nums[j];
            }
        }
        total_sum = total_sum+subset_sum;// add eachsubset sum to total sum
       } 
       return total_sum;
        

        //BY GANESH JAGGINENI
    }
   public static boolean checkBit(int n,int pos)
    {
        //to check whether bit is set or not means(1 or 0)
        //if bit is set we can take the value of array of that index
        n = n>>pos;     //we right shift n 
                        //it gives what the position value we want to check will be at least significant bit
        if((n&1) == 1)      //if lsb is 1 and performing &(and) operation gives 1 only
            return true;    // if lsb is 0 and performing &(and) operation gives 0 only
        return false;
        // if((n&(1<<pos)) != 0)
        //     return true;
        // return false;
    }
}
