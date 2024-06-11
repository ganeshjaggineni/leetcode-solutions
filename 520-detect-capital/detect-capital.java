class Solution {
    public boolean detectCapitalUse(String word) {

        boolean first_cap = false;
        boolean all_cap = true;
        boolean all_lower = true;
        int n = word.length();
        if( word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
            first_cap = true;
        
        for(int i=1;i<n;i++)
        {
          char ch = word.charAt(i);
          if(!(ch >= 'A' && ch <='Z'))
          {
            all_cap = false;
          }
           if(!(ch >= 'a' && ch <='z'))
          {
            all_lower = false;
          }

        }
       if(first_cap && all_cap)
            return true;
       else if(!first_cap && all_lower)
            return true;
        else if(first_cap && all_lower)
            return true;

        return false;
        
    }
}