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
                        System.out.println("max nic len = "+maxNiceSubStrLen);
                        System.out.println("max nice str = "+maxNiceStr);
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
        System.out.println("string = "+s);
        Iterator<Character> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
         for(char ch : s.toCharArray())
        {
            System.out.println("character alter "+(char)(ch^32));
           if(!set.contains((char)(ch^32)))
           {
            System.out.println("retrun false");
             return false;
           }
        }
        return true;
    }
}