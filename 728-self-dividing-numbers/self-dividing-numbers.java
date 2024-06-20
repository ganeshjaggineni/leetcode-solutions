class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {


        List<Integer> self_div_list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(checkSelfDividing(i))
            {
                self_div_list.add(i);
            }
        }
        return self_div_list;
    }
    private static boolean checkSelfDividing(int num)
    {
        int n = num;
        while(num != 0)
        {
            int last_digit = num%10;
            if(last_digit ==0 || n%last_digit != 0)
                return false;
            num /= 10;
        }
        return true;
    }
}