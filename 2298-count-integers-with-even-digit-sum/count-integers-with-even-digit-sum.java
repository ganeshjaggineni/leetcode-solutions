class Solution {
    public int countEven(int num) {

        int cnt = 0;
        for(int i=2;i<=num;i++)
        {
            if(findDigitSum(i))
                cnt++;
        }
        return cnt;
        
    }
    private static boolean findDigitSum(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            int last_digit = n%10;
            sum += last_digit;
            n /= 10;
        }
        return (sum%2 == 0);
    }
}