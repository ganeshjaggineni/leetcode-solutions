class Solution {
    public int countPrimes(int n) {

        // if (n == 0 || n == 1)
        //     return 0;
        // boolean[] primes = new boolean[n];
        // Arrays.fill(primes, true);
        // primes[0] = true;
        // primes[1] = true;
        // int cnt = 0;
        // for (int i = 2; i < n; i++) {
        //     if (primes[i]) {
        //         cnt++;
        //         for (int j = 2 * i; j < n; j = j + i) {
        //             if (primes[j]) {
        //                 primes[j] = false;
        //             }
        //         }
        //     }
        // }
        // return cnt;


         if (n == 0 || n == 1)
            return 0;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = true;
        primes[1] = true;
        int cnt = n-2;
        for (int i = 2; i*i<=n; i++) {
            if (primes[i]) {
                
                for (int j = i * i; j < n; j = j + i) {
                    if (primes[j]) {
                        primes[j] = false;
                        cnt--;
                    }
                }
            }
        }
        return cnt;
    }
    // BY GANESH JAGGINENI

}