class Solution {
    public int maximumLengthSubstring(String s) {
        
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
    }
}