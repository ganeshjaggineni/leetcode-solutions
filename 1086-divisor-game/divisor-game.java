class Solution {
    public boolean divisorGame(int n) {
        
        boolean alice = false;
        while(n > 1)
        {
            for(int x=1;x<=n;x++)
            {
                if(n%x == 0)
                {
                    System.out.println("n ="+n+"x ="+x);
                     alice   = !alice;
                     System.out.println("alice = "+alice);
                     n = n-x;
                     System.out.println(" n becomes "+n);
                     break;
                }
                else
                    n--;
            }
           
        }
        return alice;
    }
}