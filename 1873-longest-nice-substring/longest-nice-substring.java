class Solution {
    public String longestNiceSubstring(String s) {


        int n = s.length();
        int maxNiceSubStrLen = 0;
        String maxNiceStr = "";
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(CheckNice(s.substring(i,j+1)))
                {
                    if(j-i+1 > maxNiceSubStrLen)
                    {
                        maxNiceSubStrLen = j-i+1;
                        maxNiceStr = s.substring(i,j+1);
                    }
                }
            }
        }
            return maxNiceStr;
        
    }
    private static boolean CheckNice(String s)
    {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray())
        {
            set.add(ch);
        }
       
         for(char ch : s.toCharArray())
        {
           if(!set.contains((char)(ch^32)))
           {
             return false;
           }
        }
        return true;
    }
    //BY GANESH JAGGINENI
}