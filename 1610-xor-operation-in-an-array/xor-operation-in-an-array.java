class Solution {
    public int xorOperation(int n, int start) {


        int bit_xor = 0;
        for(int i=0;i<n;i++)
        {
            bit_xor ^= start+2*i;
        }
        return bit_xor;
        
    }
    //BY GANESH JAGGINENI
}