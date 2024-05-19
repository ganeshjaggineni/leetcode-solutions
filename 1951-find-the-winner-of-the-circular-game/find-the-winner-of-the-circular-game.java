class Solution {
    public int findTheWinner(int n, int k) {

        // base case
        if (n == 1)
            return 1;
        // sub problem
        return (k - 1 + findTheWinner(n - 1, k)) % n + 1;

    }
    //BY GANESH JAGGINENI
}