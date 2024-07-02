/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        int len = 0;
        ListNode curr = head;
        while(curr != null)
        {
            int temp_len = 0;
            ListNode temp = head;
            while(temp != curr)
            {

                temp = temp.next;
                temp_len++;

            }
                if(temp_len  != len )
                    return curr;
            len++;
            curr = curr.next;
        }
        return null;
    }
}