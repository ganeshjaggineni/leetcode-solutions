class Solution {
    public int diagonalPrime(int[][] nums) {

        int max = 4*1000000;
        boolean[] isPrime = new boolean[max+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2;i*i<=max;i++)
        {
            if(isPrime[i])
            {
                for(int j=i*i;j<=max;j +=i )
                {
                    isPrime[j] = false;
                }
            }
        }
        int maxPrime = 0;
        for(int i=0;i<nums.length;i++)
        {
           if(isPrime[nums[i][i]])
           {
                maxPrime = Math.max(maxPrime,nums[i][i]);
           }
           if(isPrime[nums[i][nums.length-i-1]])
           {
                maxPrime = Math.max(maxPrime,nums[i][nums.length-i-1]);
           }
          
        }
       
        return maxPrime;
        
    }
}