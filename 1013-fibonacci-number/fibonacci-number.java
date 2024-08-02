class Solution {
    public int fib(int n) {
        //METHOD 1 : USING RECURSION
        /*
        if(n==0 || n==1)
            return n;

        return fib(n-1)+fib(n-2);
        */
        //METHOD 2 USING DYNAMIC PROGRAMMING

       return dpFib(n);
        
    }
    
    public static int dpFib(int n)
    {
    int dp[] = new int[n+1];
    Arrays.fill(dp,-1);
        if(n==0 || n==1)
            return n;
        if(dp[n] != -1)
            return dp[n];
        return dp[n] = dpFib(n-1) + dpFib(n-2);
        
    
    }
    //BY GANESH JAGGINENI

}