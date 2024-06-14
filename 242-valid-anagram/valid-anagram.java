class Solution {
    public boolean isAnagram(String s, String t) {

        int[] ascii_count_arr = new int[256];
        if(s.length() != t.length())
            return false;
        for(int i=0;i<s.length();i++ )
        {
            ascii_count_arr[s.charAt(i)]++;
            ascii_count_arr[t.charAt(i)]--;
        }
          for(int i=0;i<256;i++ )
        {
           if(ascii_count_arr[i] != 0)
                return false;
        }
        return true;

        
    }
}