class Solution {
    public int mySqrt(int x) {

        int low = 1;
        int high = x;
        int mid = 0;
        int floor_sqr = 0;
        if(x == 0)
            return 0;
        while(low<=high)
        {
            mid = low+(high-low)/2;
            if(mid <= x/mid)
            {
            floor_sqr = mid;
            low = mid+1;

            }
            else
                high = mid-1;
        }
        return floor_sqr;
        
    }
}