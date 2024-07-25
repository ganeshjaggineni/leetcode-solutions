class Solution {
    public int[] sortArray(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int idx = 0;
        for(int i=min;i<=max;i++)
        {
            if(map.containsKey(i))
            {
                int ele_size = map.get(i);
                while(ele_size-- > 0)
                {
                    nums[idx++] = i;
                }
            }
        }
        return nums;
        
    }

    //BY GANESH JAGGINENI
}