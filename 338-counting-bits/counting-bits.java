class Solution {
    public int[] countBits(int n) {
        
        int arr[] = new int[n+1];
        int val = 0;
        for(int i=0;i<=n;i++)
        {
           val =  findSetBits(i);
           arr[i] = val;
        }
        return arr;
    }
    public static int findSetBits(int n)
    {
        int count = 0;
        while(n != 0)
        {
            count++;
            n = n&(n-1);
        }
        return count;
    }
    //BY GANESH JAGGINENI
}