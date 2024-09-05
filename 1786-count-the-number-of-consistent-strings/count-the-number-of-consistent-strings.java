class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       Set<Character> set = new HashSet<>();
       for(char ch: allowed.toCharArray())
       {
        set.add(ch);
       } 
       int consistentWords = 0;
       for(String eachWord : words)
       {
         boolean consistent = true;
         for(char ch:eachWord.toCharArray())
         {
            if(!set.contains(ch))
            {
                consistent = false;
                break;
            }
         }
         if(consistent)
            consistentWords++;
       }
       return consistentWords;
    }
}