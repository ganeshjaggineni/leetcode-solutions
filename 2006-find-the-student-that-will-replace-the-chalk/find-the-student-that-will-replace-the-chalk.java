class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        int idx = 0;
        int len = chalk.length;
        while(k>0)
        {
            if(k >= chalk[idx])
            {
              k =k- chalk[idx];
            }
            else
                return idx;
            if(idx == len-1)
            {
                idx = -1;
            }
            idx++;
        }
        return idx;
    }
}