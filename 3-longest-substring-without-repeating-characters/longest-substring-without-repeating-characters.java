class Solution {
    public int lengthOfLongestSubstring(String s) {

        // int left = 0;
        // int right = 0;
        // int longest_substring = 0;
        // int n = s.length();
        // Set<Character> set = new HashSet<>();
        // while(right < n)
        // {
        //     char ch = s.charAt(right);
        //     if(!set.contains(ch))
        //     {
        //         set.add(ch);
        //         longest_substring = Math.max(longest_substring,right-left+1);
        //         right++;
        //     }
        //     else
        //     {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        // }
        // return longest_substring;


        //METHOD 2 USING HASHMAP
        if(s.length() == 1)
            return 1;
        int start = 0;
        int end = 0;
        Map<Character,Integer> mapind = new HashMap<>();
        int maxlen = 0;
        while(end < s.length())
        {
            char ch = s.charAt(end);
            if(mapind.containsKey(ch) && mapind.get(ch) >= start)
            {
                start = mapind.get(ch)+1;
            }


            mapind.put(ch,end);
            maxlen = Math.max(maxlen,end-start+1);

         end++;
        }
        return maxlen;

        
    }
    //BY GANESH JAGGINENI
}