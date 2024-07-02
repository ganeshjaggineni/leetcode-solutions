class Solution {
    public int pivotInteger(int n) {
        
        int pivot_before_sum = 0;
        int pivot_after_sum = 0;
        for(int i=1;i<=n;i++)
        {
            pivot_before_sum = findSum(1,i);
            pivot_after_sum = findSum(i,n);
            if(pivot_before_sum == pivot_after_sum)
            {
                return i;
            }
        }
        return -1;

    }
    private static int findSum(int start ,int pivot)
    {
        int sum = 0;
        for(int i=start;i<=pivot;i++)
        {
            sum = sum+i;
        }
        return sum;
    }   
    //  BY GANESH JAGGINENI
}