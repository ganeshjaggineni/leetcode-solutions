class Solution {
    public int minSteps(int n) {

       int primeFactor = 2;
        int sum = 0;
        while(n > 1)
        {
            while(n%primeFactor == 0)
            {
                n /= primeFactor;
                sum += primeFactor;
            }
            primeFactor++;
        }
        return sum;
    }
    //BY GANESH JAGGINENI
}