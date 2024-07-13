class Solution {
    public String truncateSentence(String s, int k) {
        
        int end_idx = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                k--;
                if(k == 0)
                {
                    end_idx = i;
                    break;
                }
            }
        }
        if(k > 0)
            return s;
        else
            return s.substring(0,end_idx);
    }
    //BY GANESH JAGGINENI
}