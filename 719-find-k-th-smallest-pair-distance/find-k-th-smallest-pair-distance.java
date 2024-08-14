class Solution {
    public int smallestDistancePair(int[] nums, int k) {

        Arrays.sort(nums);
        int n = nums.length;
        int maxEle = nums[n-1] - nums[0];

        int[] countDist = new int[maxEle+1];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int dist = Math.abs(nums[i]-nums[j]);
                countDist[dist]++;
            }
        }
        //finding kth smallest distance
        for(int i=0;i<=maxEle;i++)
        {
            k = k - countDist[i];
            if(k <= 0)
                return i;
        }
        return -1;
        
    }
    //BY GANESH JAGGINENI
}