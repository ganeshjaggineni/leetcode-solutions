class Solution {
    public double myPow(double x, int n) {
        
       // return Math.pow(x,n);
        long N = n;
        if(N<0)
            {
                N = -N;
                x = 1/x;
            }
        double ans = findPower(x,N);
      
     return ans;
    }
    public  static double findPower(double x,long n)
    {
        if(n == 0)
            return 1;
        double p = findPower(x,n/2);
        if((n&1) == 0)
            return p*p;
        else 
            return x*p*p;

    }
    //BY GANESH JAGGINENI
}