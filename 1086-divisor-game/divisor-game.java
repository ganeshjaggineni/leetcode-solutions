class Solution {
    public boolean divisorGame(int n) {
        
        boolean alice = false;
        while(n > 1)
        {
            for(int x=1;x<=n;x++)
            {
                if(n%x == 0)
                {
                     alice   = !alice;
                     n = n-x;
                     break;
                }
                else
                    n--;
            }
           
        }
        return alice;
    }
}