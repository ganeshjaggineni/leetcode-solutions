class Solution {
    public int chalkReplacer(int[] chalk, int k) {

       //Approach 1 : simulating bruteforce 
       /*
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
        */

        //APPROACH 2 using math division
        int n = chalk.length;
        long sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += chalk[i];
        }
        k = (int)(k%sum);
      
        for(int i=0;i<n;i++)
        {
            if(k < chalk[i])
                return i;
            k -= chalk[i];
        }
        
        return 0;
    }
}