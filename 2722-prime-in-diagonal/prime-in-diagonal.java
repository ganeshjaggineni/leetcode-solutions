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
            for(int j=0;j<nums[0].length;j++)
            {
                if(i == j || j==nums.length-i-1)
                {
                    if(isPrime[nums[i][j]])
                    {
                        maxPrime = Math.max(maxPrime,nums[i][j]);
                    }
                }
            }
        }
        return maxPrime;
        
    }
}