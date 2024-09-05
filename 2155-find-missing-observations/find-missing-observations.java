class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sumM = 0;
        int mLen = rolls.length;
        for(int i=0;i<mLen;i++)
        {
            sumM += rolls[i];
        }
        int sumN = mean*(mLen+n)-sumM;
        int meanN = sumN/n;
        int remN = sumN%n;
        if(sumN > 6*n || sumN < n)
            return new int[]{};
        int[] rollN = new int[n];
        System.out.println("sum N = "+sumN);
        System.out.println("sum M = "+sumM);
     System.out.println("n = "+n+" Mlen = "+mLen);


      
        for(int i=0;i<n;i++)
        {
            rollN[i] = meanN;
        }
        for(int i=0;i<remN;i++)
        {
            rollN[i]++;
        }
        
    return rollN;
    }
}