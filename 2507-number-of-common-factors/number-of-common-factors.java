class Solution {
    public int commonFactors(int a, int b) {

        int lowNum = (a>=b)?a:b;
        int commonFactors = 0;
        for(int i=1;i<=lowNum;i++)
        {
            if(a%i == 0 && b%i == 0)
                commonFactors++;
        }
        return commonFactors;
        
    }
    //BY GANESH JAGGINENI
}