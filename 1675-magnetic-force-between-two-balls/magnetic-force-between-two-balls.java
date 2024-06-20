class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        int n = position.length;
        int min_range = 1;
        int max_range = position[n-1];
        while(min_range <= max_range)
        {
            int mid = min_range+(max_range-min_range)/2;
            if(checkAllBasketsFilled(mid,position,n,m))
            {
                min_range = mid + 1;
            }
            else
            {
                max_range = mid - 1;
            }
        }
      return max_range;  
    }
    public static boolean checkAllBasketsFilled(int mid, int[] position,int n,int m)
    {
        int filled_baskets = 1;
        int prev_basket = position[0];
        for(int i=1;i<n;i++)
        {
            int curr_basket = position[i];
            if(curr_basket - prev_basket >= mid)
            {
                filled_baskets++;
                prev_basket = curr_basket;
            }
        }
        return filled_baskets >= m;
    }
}