class Solution {
    public int singleNumber(int[] nums) {

        // int ans = 0;
        // for (int i = 0; i < 32; i++) {
        //     int sum = 0;
        //     for (int j = 0; j < nums.length; j++) {
        //         if ((nums[j] & (1 << i)) != 0) {
        //             sum = sum + 1;
        //         }

        //     }
        //     if (sum % 3 != 0)
        //         ans = ans | (1 << i);
        // }
        // return ans;

        int bit_count_arr[] = new int[32];

        for(int num : nums)
        {
            for(int i=0;i<32;i++)
            {
                if((num & (1<<i)) != 0)
                    bit_count_arr[i]++;
            }
        }
        int res = 0;
        for(int i=0;i<32;i++)
        {
            if(bit_count_arr[i]%3 != 0)
                res |= (1<<i);
        }
        return res;
    }
    // BY GANESH JAGGINENI

}