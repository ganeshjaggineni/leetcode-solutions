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
      //  return (n%2 == 0)?true:false;

        //METHOD 3 using dynamic programming
        boolean[] gameState = new boolean[n+1];
        gameState[1] = false;
        for(int i=2;i<=n;i++)
        {
        for(int x=1;x<i;x++)
        {
            boolean foundDiv = false;
            if(i%x == 0)
            {
                if(!gameState[i-x])
                {
                    gameState[i] = true;
                    foundDiv = true;
                    break;
                }
                if(foundDiv)
                {
                    break;
                }
            }
        }
        }
        return gameState[n];
    }
}