class Solution {
    public int pivotInteger(int n) {
        
    //     int pivot_before_sum = 0;
    //     int pivot_after_sum = 0;
    //     for(int i=1;i<=n;i++)
    //     {
    //         pivot_before_sum = findSum(1,i);
    //         pivot_after_sum = findSum(i,n);
    //         if(pivot_before_sum == pivot_after_sum)
    //         {
    //             return i;
    //         }
    //     }
    //     return -1;

    // }
    // private static int findSum(int start ,int pivot)
    // {
    //     int sum = 0;
    //     for(int i=start;i<=pivot;i++)
    //     {
    //         sum = sum+i;
    //     }
    //     return sum;

    //METHOD 2 PREFIX SUM
    int sum = 0;
    int[] sum_array = new int[n+1];
    sum_array[0] =0;
    for(int i=1;i<=n;i++)
    {
        sum_array[i] = sum_array[i-1]+i;
    }
    for(int i=1;i<=n;i++)
    {
        if(sum_array[i] == sum_array[n]-sum_array[i-1])
        {
            return i;
        }
    }
    return -1;
    }   
    //  BY GANESH JAGGINENI
}