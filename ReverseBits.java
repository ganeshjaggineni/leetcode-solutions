public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        int res = 0;
        for(int i=0;i<32;i++)
        {
            int last_bit = n&1;
            res = res<<1;
            res = res | last_bit;
            n = n>>1;
            // System.out.println(last_bit);
        }
        return res;
        
    }
}