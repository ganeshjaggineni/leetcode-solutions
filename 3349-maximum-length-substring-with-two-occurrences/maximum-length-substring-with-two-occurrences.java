class Solution {
    public int maximumLengthSubstring(String s) {

      /*  
        int maxlen = 0;
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            Map<Character,Integer> freq = new HashMap<>();
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
            for(int j=i+1;j<n;j++)
            {
            freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);
                if(checkOccurences(freq))
                {
                    maxlen = Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }
    private static boolean checkOccurences(Map<Character,Integer> m)
    {
        for(Map.Entry<Character,Integer> entry : m.entrySet())
        {
            if(entry.getValue() > 2)
                return false;
        }
        return true;
        */

        //METHOD 2 SLIDING WINDOW

        int left = 0;
        int right = 0;
        int n = s.length();
        int max_substr_len = 0;
        Map<Character,Integer> charcount = new HashMap<>();

        while(right < n)
        {
            char ch = s.charAt(right);
            System.out.println("char at right = "+ch);
            charcount.put(ch,charcount.getOrDefault(ch,0)+1);
            if(charcount.get(ch) > 2)
            {
                System.out.println("char count > 2 "+ch);
                while(charcount.get(ch) > 2)
                {
                    System.out.println("in while");
                    charcount.put(s.charAt(left),charcount.get(s.charAt(left))-1);
                    if(charcount.get(s.charAt(left)) == 0)
                        charcount.remove(s.charAt(left));
                    left++;
                    System.out.println("left pointer "+left);
                }

                System.out.println("max sub str len = "+max_substr_len);
                System.out.println("right pointer before = "+right);
            }
                max_substr_len = Math.max(max_substr_len,right-left+1);
                right++;
        }
        return max_substr_len;
    }
}