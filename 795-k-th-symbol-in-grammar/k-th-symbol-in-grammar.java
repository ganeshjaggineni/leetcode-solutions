class Solution {
    public int kthGrammar(int n, int k) {

       //base case 
        if(n==1 && k==1)
            return 0;
        //recursive case
       // int len = (int)Math.pow(2,n-1);

        int len = 1<<(n-1); //similar to above commented line to calculate length  a<<i = a*2^i;
        int mid = len/2; //by checking the k values lies before the mid or after the mid
        if(k<=mid)  // if it lies before the mid then it is same as above pattern ,otherwise alternate to above pattern
            return kthGrammar(n-1,k); //the pattern is same as smaller sub probelm
        else
           return  (kthGrammar(n-1,k-mid))^1; //the pattern is alternate bit value to same smaller sub problem
    }
    //BY GANESH JAGGINENI
}