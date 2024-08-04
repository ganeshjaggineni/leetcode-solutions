class Solution {
    private int MOD = 1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {

        int subArrSum = 0;
        List<Integer> subArrList = new ArrayList<>();
        // subArrList.add(0);
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=i;j<n;j++)
            {
                sum += nums[j];
                subArrList.add(sum);
            }
        }

        Collections.sort(subArrList);
        System.out.println(subArrList);
        for(int i=left-1;i<right;i++)
        {
            subArrSum = (subArrSum+subArrList.get(i))%MOD;
        }
        return subArrSum;
        
    }
}