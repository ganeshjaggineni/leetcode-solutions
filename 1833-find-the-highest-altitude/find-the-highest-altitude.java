class Solution {
    public int largestAltitude(int[] gain) {

        /*
        int n = gain.length;
        int[] prefix_height = new int[n+1];
        prefix_height[0] = 0;
        for(int i=1;i<=n;i++)
        {
            prefix_height[i] = prefix_height[i-1]+gain[i-1];
            // System.out.println(prefix_height[i]);
        }
        Arrays.sort(prefix_height);
        // System.out.println(Arrays.toString(prefix_height));
        return prefix_height[n];

        */

        int n = gain.length;
        int max_alti = 0;
        int alti = 0;
        for(int i=0;i<n;i++)
        {
            alti = alti+gain[i];
            max_alti = Math.max(alti,max_alti);
        }
        return max_alti;
        
    }
}