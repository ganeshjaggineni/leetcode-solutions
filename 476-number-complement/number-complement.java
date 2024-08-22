class Solution {
    public int findComplement(int num) {
    int ans = 0;
    int idx =0;
      while(num !=0 )
    {
        
            ans = ans|(1-(num&1))<<idx;
        num = num>>1;
        idx++;
    }
    return ans;
        
    }
}