class Solution {
    public int minimumPushes(String word) {
      Map<Character,Integer> freq = new HashMap<>();
      for(int i=0;i<word.length();i++)
      {
        char ch = word.charAt(i);
        freq.put(ch, freq.getOrDefault(ch,0)+1);
      } 
      List<Integer> charFreq = new ArrayList<>(freq.values());
     charFreq.sort(Collections.reverseOrder());
      System.out.println(charFreq);
      int currentPushCost = 1;
      int totalCost = 0;
      int pushCnt = 0;
      for(int i=0;i<charFreq.size();i++)
      {
        int frequency = charFreq.get(i);
        totalCost += frequency*currentPushCost;
        pushCnt++;
        if(pushCnt == 8)
        {
            pushCnt = 0;
            currentPushCost++;
        }
      } 
    return totalCost;
    }
    //BY GANESH JAGGINENI
}