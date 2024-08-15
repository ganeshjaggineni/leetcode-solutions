class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int fiveDollarsBills = 0;
        int tenDollarsBills = 0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i] == 5)
                fiveDollarsBills++;
            else if(bills[i] == 10)
            {
                tenDollarsBills++;
                if(fiveDollarsBills >= 1)
                    fiveDollarsBills--;
                else
                    return false;
            }
            else if(bills[i] == 20)
            {
                if(tenDollarsBills >= 1 && fiveDollarsBills >=1 )
                {
                    tenDollarsBills--;
                    fiveDollarsBills--;
                }
                else if(fiveDollarsBills >=3)
                {
                    fiveDollarsBills -= 3;
                }
                else
                    return false;
            }
        }
        return true;
    }
    //BY GANESH JAGGINENI
}