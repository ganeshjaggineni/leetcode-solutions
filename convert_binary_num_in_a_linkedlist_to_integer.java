/*
		CONVERT BINARY NUMBER IN A LINKED LIST TO INTEGER
		==================================================

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
 

Constraints:

The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.
*/
//CODING
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
       
       /*
       //finding length and decrease 1 in power in every iteration
       //bin = 101
       //len=3
       //intnum=1*(2^3-1)+0*(2^2-1)+1*(2^1-1)
        ListNode temp = head;
        int len = 0,intNum = 0;
        while(temp != null)
        {
            len++;
            temp = temp.next;
        }
        System.out.println(len);
        temp = head;
        while(temp != null)
        {
            intNum = intNum +(int) Math.pow(2,len-- -1)*temp.val;
            temp = temp.next;
        }
        return intNum;
        */
        
    /*
    //reversing linked list and applying normal math method
        ListNode prev = null;
        ListNode currnode = head;
        ListNode nextnode = null;
        int degree = 0, integerNum = 0;
        while(currnode != null)
        {
            nextnode = currnode.next;
            currnode.next = prev;
            prev = currnode;
            currnode = nextnode;
        }
        ListNode temp = prev;
        while(temp != null)
        {
            integerNum = integerNum +((int)Math.pow(2,degree++))*temp.val;
            temp = temp.next;
            // System.out.println(integerNum);
        }
        return integerNum;
    */

//left shifting one position 
//in this approach we assme a node is a final node and add to answer,further if we find the node is not an final node just we multiply with 2 to all previous nodes and add present node value... this process run untill we reach end of list
        ListNode temp = head;
        int integerconversion = 0;
        while(temp != null)
        {
            integerconversion = integerconversion*2 + temp.val;
            temp = temp.next;
        }
        return integerconversion;


    }
}