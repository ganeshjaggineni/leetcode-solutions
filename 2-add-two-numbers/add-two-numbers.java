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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode  dummyhead = new ListNode(0); //
        ListNode curr = dummyhead; //store the current node and update it val variablen and next variable

        int carry = 0; //the remaining carry value  when we perform addition
        int sum = 0;  //declaration and initialization of sum
        while(l1 != null || l2!=null) //loop until both two list reaches end
        {                               //due to different length if one list has reached null but we must perform addition for remaining nodes of any list
            int x = (l1 != null)?l1.val:0;  //if node has value take it oterwise it is 0
             int y = (l2 != null)?l2.val:0;
             sum = x+y+carry;
             carry = sum/10; //to calculate the carry we need to carryfor next node
             curr.next = new ListNode(sum%10); //update current node reference value with the a new node contains value of current sum
             curr = curr.next; //move the current pointer to next which reprsents newly created node for current sum
           if(l1 != null)
                 l1 = l1.next;  //if remaining nodes present update the pointers,respectively
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry>0)
        {
            curr.next = new ListNode(carry); //
        }
        
        return dummyhead.next; //note dummy contain some random value
                                //we must return dummy.next which contain reference to the sum of 1st msb bit of 2 nodes
    }
    //BY GANESH JAGGINENI
}