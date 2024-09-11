class Solution {
    public int minBitFlips(int start, int goal) {

        int flipCnt = 0;
        for(int i=0;i<32;i++)
        {
            int sum = 0;
            if((start&(1<<i))!=0)
                sum += 1;
            if((goal&(1<<i))!= 0)
                sum+=1;
            if(sum%2 != 0)
                flipCnt++;
        }
        return flipCnt;
        
    }
}