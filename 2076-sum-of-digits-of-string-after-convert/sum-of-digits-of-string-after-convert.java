class Solution {
    public int getLucky(String s, int k) {
        
        int sum = 0;
        for(int i=0;i<s.length();i++)
        {
           sum += findSum(s.charAt(i)-96);
        }
           
        while(k-- > 1)
        {
            int num = sum;
            sum = 0;
            sum += findSum(num);
        }
         return sum;
    }
    public int findSum(int num)
    {
        int sum = 0;
        if(num <= 9)
            return num;
        while(num != 0)
        {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}