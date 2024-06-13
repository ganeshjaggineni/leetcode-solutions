class Solution {
    public int maximumWealth(int[][] accounts) {

        int max_wealth = Integer.MIN_VALUE;
        for(int[] wealth : accounts)
        {
        int amt = 0;
            for(int money : wealth)
            {
                amt += money;
            }
            if(amt > max_wealth )
                max_wealth = amt;
        }
        return max_wealth;
        
    }
}