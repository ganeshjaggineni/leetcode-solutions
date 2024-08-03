class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        Map<Integer,Integer> targetFreqMap = new HashMap<>();
        for(int i=0;i<target.length;i++)
        {
            targetFreqMap.put(target[i],targetFreqMap.getOrDefault(target[i],0)+1);
        }
          Map<Integer,Integer> arrFreqMap = new HashMap<>();
         for(int i=0;i<arr.length;i++)
        {
             arrFreqMap.put(arr[i],arrFreqMap.getOrDefault(arr[i],0)+1);
        }
        if(targetFreqMap.keySet().size() != arrFreqMap.keySet().size())
            return false;
        for(int ele:targetFreqMap.keySet())
        {
            if(targetFreqMap.get(ele) != arrFreqMap.get(ele))
                return false;
        }
        return true;
    }
    //BY GANESH JAGGINENI
}