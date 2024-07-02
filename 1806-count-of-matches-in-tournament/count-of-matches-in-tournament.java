class Solution {
    public int numberOfMatches(int n) {
        int teams = n;
        int matches = 0;
        while(teams > 1)
        {
                matches = matches+(teams/2);
            if(teams%2 == 0)
            {
                teams = teams/2;
            }
            else
            {
               teams = teams/2+1;
            }
            
        }
        return matches;
    }
}