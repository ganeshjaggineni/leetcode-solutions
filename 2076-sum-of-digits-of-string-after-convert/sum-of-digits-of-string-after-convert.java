class Solution {
    public int getLucky(String s, int k) {
        
        int sum = 0;

        for(int i=0;i<s.length();i++)
        {
            System.out.println("char "+(s.charAt(i)-96));
           sum += findSum(s.charAt(i)-96);
           System.out.println("sum = "+sum);
        }
        k = k-1;
           
    while(k-- > 0)
    {
         int num = sum;
        sum = 0;
        while(num != 0)
        {
            sum += num%10;
            num /= 10;
        }
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