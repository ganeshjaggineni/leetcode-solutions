class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;
        // System.out.println(n);
        boolean[] visited = new boolean[n+1];
        //0 indexed
        for(int i=0;i<n;i++)
        {
            if(nums[i] > 0 && nums[i] <= n)
                visited[nums[i]] = true;
        }
        for(int i=1;i<=n;i++)
        {
            if(!visited[i])
                return i;
        }
        return n+1;
    }
}