class Solution {
    public int countGoodSubstrings(String s) {
    /*
        int n = s.length();
        int count = 0;
        for(int i=0;i<n-2;i++)
        {
            if(s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) &&s.charAt(i) != s.charAt(i+2))
            {
                count++;
            }
        }
        return count;
       */
       //METHOD 2
        int n = s.length();
        int count = 0;
        for(int i=0;i<n-2;i++)
        {
            if(isValidSubStr(s.substring(i,i+3)))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean isValidSubStr(String str)
    {
        Set<Character> set = new HashSet<>();
        for(char ch:str.toCharArray())
        {
            set.add(ch);
        }
        return (set.size()==3);
    }

    //BY GANESH JAGGINENI
}