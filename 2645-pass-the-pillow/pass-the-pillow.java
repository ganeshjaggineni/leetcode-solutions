class Solution {
    public int passThePillow(int n, int time) {

        boolean right = true;
        boolean left = true;
        int var = 1;
        while(time-- > 0)
        {
            if(right)
            {
             var++;
            }
            else if(left)
            {
                var--;
            }
            if(var == n)
            {
                right = false;
                left = true;
            }
            if(var == 1)
            {
                left = false;
                right = true;
            }
        }
        return var;
        
    }
}