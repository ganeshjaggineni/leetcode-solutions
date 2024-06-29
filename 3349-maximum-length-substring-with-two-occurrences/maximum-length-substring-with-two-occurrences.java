class Solution {
    public int maximumLengthSubstring(String s) {

        /*
         * int maxlen = 0;
         * int n = s.length();
         * for(int i=0;i<n;i++)
         * {
         * Map<Character,Integer> freq = new HashMap<>();
         * freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
         * for(int j=i+1;j<n;j++)
         * {
         * freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);
         * if(checkOccurences(freq))
         * {
         * maxlen = Math.max(maxlen,j-i+1);
         * }
         * }
         * }
         * return maxlen;
         * }
         * private static boolean checkOccurences(Map<Character,Integer> m)
         * {
         * for(Map.Entry<Character,Integer> entry : m.entrySet())
         * {
         * if(entry.getValue() > 2)
         * return false;
         * }
         * return true;
         */

        // METHOD 2 SLIDING WINDOW

        int left = 0;
        int right = 0;
        int n = s.length();
        int max_substr_len = 0;
        Map<Character, Integer> charcount = new HashMap<>();

        while (right < n) {
            char right_ch = s.charAt(right);
            charcount.put(right_ch, charcount.getOrDefault(right_ch, 0) + 1);

            while (charcount.get(right_ch) > 2) {
                char left_ch = s.charAt(left);
                charcount.put(left_ch, charcount.get(left_ch) - 1);
                if (charcount.get(left_ch) == 0)
                    charcount.remove(left_ch);
                left++;
            }

            max_substr_len = Math.max(max_substr_len, right - left + 1);
            right++;
        }
        return max_substr_len;
    }
}