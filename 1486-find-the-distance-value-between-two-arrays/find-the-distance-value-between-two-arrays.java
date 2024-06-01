class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        // int count = 0;
        // for(int i=0;i<arr1.length;i++)
        // {
        //     boolean valid = true;
        //     for(int j=0;j<arr2.length;j++)
        //     {
        //         if(Math.abs(arr1[i]-arr2[j]) <= d)
        //         {
        //             valid = false;
        //             break; 
        //         }
        //     }
        //     if(valid)
        //         count++;
        // }
        // return count
       
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int dist = 0;
        for(int num:arr1)
        {
             dist += validBinSearch(num,arr2,d);
        }
        return dist;
        
    }
    public static int validBinSearch(int num,int[] arr2,int d)
    {
        int low = 0,high = arr2.length-1;
        boolean valid = true;
        while(low <= high)
        {
            int mid = (low+high)/2;
            int diff = Math.abs(num-arr2[mid]);
            if(diff <= d )
            {
                valid = false;
                break;
            }
            else if(num < arr2[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return (valid==true)?1:0;
    }
    //BY GANESH JAGGINENI
}