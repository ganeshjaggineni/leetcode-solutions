class Solution {
    public int findComplement(int num) {
  /*
    int ans = 0;
    int idx =0;
      while(num !=0 )
    {
        
            ans = ans|(1-(num&1))<<idx;
        num = num>>1;
        idx++;
    }
    return ans;
    */
        

        //METHOD 2
        int len = 1;
        int n = num;
        while((num = num>>1) != 0)
            len++;
        System.out.println(len);
       
        int mask = (1<<len)-1;
        System.out.println(mask);
        return n^mask;
    }

}