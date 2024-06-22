class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int longest_substring = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        while(right < n)
        {
            char ch = s.charAt(right);
            if(!set.contains(ch))
            {
                set.add(ch);
                longest_substring = Math.max(longest_substring,right-left+1);
                right++;
            }
            else
            {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return longest_substring;
        
    }
    //BY GANESH JAGGINENI
}