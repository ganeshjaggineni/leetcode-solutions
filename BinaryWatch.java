/*
A binary watch has 4 LEDs on the top to represent the hours (0-11), and 6 LEDs on the bottom to represent the minutes (0-59). Each LED represents a zero or one, with the least significant bit on the right.

For example, the below binary watch reads "4:51".


Given an integer turnedOn which represents the number of LEDs that are currently on (ignoring the PM), return all possible times the watch could represent. You may return the answer in any order.

The hour must not contain a leading zero.

For example, "01:00" is not valid. It should be "1:00".
The minute must consist of two digits and may contain a leading zero.

For example, "10:2" is not valid. It should be "10:02".
 

Example 1:

Input: turnedOn = 1
Output: ["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]
Example 2:

Input: turnedOn = 9
Output: []
 

Constraints:

0 <= turnedOn <= 10
*/

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {

        // int tot_count = 0;
        // List<String> res = new ArrayList<>();
        // StringBuilder s = new StringBuilder();
        // for(int i=0;i<12;i++)
        // {
        //     for(int j=0;j<60;j++)
        //     {
        //        tot_count = findSetBits(i) + findSetBits(j);
        //        if(tot_count == turnedOn)
        //        {
        //         s.append(i).append(':').append(String.format("%02d",j));
        //         res.add(s.toString());
        //         s.setLength(0);
        //        }
        //     }
        // }
        // return res;
        List<String> list = new ArrayList<>();

        int[] hr_bit = new int[12];
        int[] min_bit = new int[60];
        for(int i=0;i<12;i++)
        {
            hr_bit[i] = findSetBits(i);
        
        }
         for(int i=0;i<60;i++)
        {
            min_bit[i] = findSetBits(i);
        
        }

        for(int i=0;i<12;i++)
        {
            for(int j=0;j<60;j++)
            {
                if(hr_bit[i]+min_bit[j] == turnedOn)
                {
                    list.add(i+":"+String.format("%02d",j));
                }
            }
        }
        return list;
        
    }
    public int findSetBits(int n)
    {
        int count = 0;
        while(n>0)
        {
        count += (n&1);
        n >>= 1;
        }
        return count;
        
}
}
