class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int len = piles.length;
        int max_piles = Integer.MIN_VALUE;
      for(int i=0;i<len;i++)
      {
        if(piles[i] > max_piles)
            max_piles = piles[i];
      } 
    //   System.out.println(max_piles); 
     int low = 1;
     int high = max_piles;
     long res = 0;
     while(low <= high)
     {
     int mid = low+(high-low)/2;
        long ans = eatBananas(piles,mid);
        if(ans <= h)
        {
           res = mid;
           high = mid-1;
        }
        else 
            low = mid+1;
       
     }
        
    return (int)res;
    }
    public static long eatBananas(int[] piles,int k)
    {
        long value = 0;
        for(int i=0;i<piles.length;i++)
        {
            // System.out.println("ceil ="+(int)Math.ceil((double)30/4));
            value +=  (int)Math.ceil((double)piles[i]/k);
        }
            System.out.println("for k ="+k+" value = "+value);
    return value;
    }
    //BY GANESH JAGGINENI
}