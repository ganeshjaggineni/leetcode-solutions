class Solution {
    public boolean isPalindrome(int x) {

        int num = x;
        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num*10+num%10;
            num /= 10;
        }
        if(x == rev_num)
            return true;

        return false;
        
    }
    //BY GANESH JAGGINENI
}