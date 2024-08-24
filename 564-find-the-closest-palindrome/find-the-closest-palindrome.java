class Solution {
    public String nearestPalindromic(String n) {

        int midLen = 0;
        boolean even = false;
        int len = n.length();
        if(len%2 == 0)
        {
            even = true;
            midLen = len/2;
        }
        else
            midLen = len/2 + 1;
        
        long firstHalf = Long.parseLong(n.substring(0,midLen));
        long[] possiblePali = new long[5];
        int idx = 0;
        possiblePali[idx++] = buildPali(firstHalf,even);
        possiblePali[idx++] = buildPali(firstHalf-1,even);
        possiblePali[idx++] = buildPali(firstHalf+1,even);
        possiblePali[idx++] = (long)Math.pow(10,len-1)-1;
        possiblePali[idx++] = (long)Math.pow(10,len)+1;

        System.out.println(Arrays.toString(possiblePali));
        long closestPali = findClosestPali(possiblePali,Long.parseLong(n));
        return String.valueOf(closestPali);
    }
    public long buildPali(long num,boolean even)
    {
        long secondHalf = num;
        if(!even)
        {
            secondHalf = secondHalf/10;
        }
        while(secondHalf > 0)
        {
            num = num*10 + secondHalf%10;
            secondHalf /= 10;
        }
        return num;
    }
    public long findClosestPali(long[] palindromes,long givenPali)
    {
        long minDiff = Long.MAX_VALUE;
        long res = 0;
        for(long num : palindromes)
        {
            if(num == givenPali)
                continue;
            long currDiff = Math.abs(num-givenPali);

            if( currDiff < minDiff)
            {
                minDiff = currDiff;
                res = num;
            }
            else if(currDiff == minDiff)
            {
                res = Math.min(res,num);
            }
        }
        return res;
    }
}