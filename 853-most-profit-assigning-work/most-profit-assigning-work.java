class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int total_profit = 0;
        for(int i=0;i<worker.length;i++)
        {
        int prof = 0;
            for(int j=0;j<difficulty.length;j++)
            {
                if((difficulty[j] <= worker[i]))
                {
                    prof = Math.max(prof,profit[j]);
                }
            }
            total_profit = total_profit+prof;
        }
        return total_profit;
        
    }
}