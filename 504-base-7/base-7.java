class Solution {
    public String convertToBase7(int num) {

        if(num == 0)
            return "0";
        String s = "";
        boolean neg = false;
        if(num < 0)
        {
            num = -num;
            neg = true;
        }
        while(num >0)
        {
            int rem = num%7;
            s = String.valueOf(rem)+s;
            num = num/7;
        }
       return (neg==true)?("-"+s):s;
        
    }
}