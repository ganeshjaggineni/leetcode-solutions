class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> distFreq = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
           distFreq.put(arr[i],distFreq.getOrDefault(arr[i],0)+1);
        }
        for(String str : arr)
        {
            if(distFreq.get(str) == 1)
            {
                k--;
                if(k == 0)
                    return str;
            }
        }
        return "";
    }
}