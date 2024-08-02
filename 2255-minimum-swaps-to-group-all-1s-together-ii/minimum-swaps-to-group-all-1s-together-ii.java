class Solution {
    public int minSwaps(int[] nums) {

        int n = nums.length;
        int[] arr = new int[2*n];
        System.arraycopy(nums,0,arr,0,n);
        System.arraycopy(nums,0,arr,n,n);
        System.out.println(Arrays.toString(arr));
        int windowSize = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 1)
                windowSize++;
        }
       
        int i = 0;
        int j = 0;
        int onesCnt = 0;
        int maxOnes = 0;
        while(j<2*n)
        {
            if(arr[j] == 1)
                onesCnt++;
            if(j-i+1 > windowSize)
            {
                onesCnt -= arr[i];
                i++;
            }
            maxOnes = Math.max(maxOnes,onesCnt);
            j++;
        }
        return windowSize - maxOnes;
    
      
    }
}