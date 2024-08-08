class Solution {
    public boolean divisorGame(int n) {
        //METHOD 1 STIMULATION
        /*
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
        */

        //METHOD 2 USING LOGIC
        return (n%2 == 0)?true:false;
    }
}