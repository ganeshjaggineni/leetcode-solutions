class Solution {
    public int sumBase(int n, int k) {

        int sum = 0;
        while (n != 0) {
            int last_digit = n % k;
            sum += last_digit;
            n /= k;
        }
        return sum;

    }
    // BY GANESH JAGGINENI
}