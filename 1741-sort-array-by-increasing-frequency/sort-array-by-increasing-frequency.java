class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        Integer intNums[] = new Integer[n];
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            intNums[i] = nums[i];
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }
        Arrays.sort(intNums, (a,b)->{
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            if(freqA == freqB)
            {
                return Integer.compare(b, a);
            }
            return Integer.compare(freqA, freqB);
        });
        
        for(int i=0;i<n;i++)
        {
            nums[i] = intNums[i];
        }
        return nums;
    }
    //BY GANESH JAGGINENI
}