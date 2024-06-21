class Solution {
    public int reverse(int x) {

        boolean neg = false;
        if(x < 0)
        {
            neg = true;
            x = -x;
        }
        long rev_digit = 0;
        while(x != 0)
        {
            int last_digit = x%10;
            rev_digit = rev_digit*10+last_digit;
            x = x/10;
        }
        if(neg)
        {
            rev_digit = -rev_digit;
        }
        if(rev_digit <= Integer.MIN_VALUE || rev_digit >= Integer.MAX_VALUE)
            return 0;

    return (int)rev_digit;
        
    }
}