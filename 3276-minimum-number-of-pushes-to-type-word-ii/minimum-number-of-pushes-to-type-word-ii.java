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
      int keysUsedCnt = 0;
      for(int i=0;i<charFreq.size();i++)
      {
        int frequency = charFreq.get(i);
        keysUsedCnt++;
        if(i%8 == 0 && i != 0)
        {
            keysUsedCnt = 0;
            currentPushCost++;
        }
        totalCost += frequency*currentPushCost;
      } 
    return totalCost;
    }
    //BY GANESH JAGGINENI
}