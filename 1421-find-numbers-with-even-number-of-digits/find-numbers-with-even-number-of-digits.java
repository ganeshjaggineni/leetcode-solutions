class Solution {
    public int findNumbers(int[] nums) {

        int even_cnt_dig = 0;
        for(int i=0;i<nums.length;i++)
        {
           int len =  findNoOfDig(nums[i]);
           if(len%2 == 0)
             even_cnt_dig++;
        }
        return even_cnt_dig;

        
    }
    private static int findNoOfDig(int num)
    {
        int len = 0;
        while(num > 0)
        {
            len++;
            num = num/10;
        }
        return len;
    }
        //BY GANESH JAGGINENI
}