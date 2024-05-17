/*
Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

 

Example 1:

Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101
Example 2:

Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.
Example 3:

Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.
 

Constraints:

1 <= n <= 231 - 1
*/
class Solution {
    public boolean hasAlternatingBits(int n) {

    //         int first_bit = n&1;
    //         n >>= 1;
    //         int second_bit = 0;
    //     while(n > 0)
    //     {
          
    //          second_bit = n&1;
    //         if(first_bit == second_bit)
    //             return false;
    //         first_bit = second_bit;
    //        n >>= 1;
    //     }
    //     return true;
        
   

    n = n^(n>>1);
    return (n&(n+1))==0;
    
}
}
