class Solution {
    public int nthUglyNumber(int n) {
        
        TreeSet<Long> uglySet = new TreeSet<>();
        uglySet.add(1L);
        Long currUgly = 1L;
        for(int i=0;i<n;i++)
        {
            currUgly = uglySet.first();
            uglySet.add(currUgly*2);
            uglySet.add(currUgly*3);
            uglySet.add(currUgly*5);
            uglySet.pollFirst();
            
        }
        return currUgly.intValue();
    }
}