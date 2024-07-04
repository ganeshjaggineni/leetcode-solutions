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
    public ListNode mergeNodes(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = dummy;
        ListNode p2 = head.next;
        while(p1 != null)
        {
            int sum = 0;
            while(p2 != null && p2.val != 0)
            {
                sum = sum+p2.val;
                p2 = p2.next;
            }
            if(p2 != null)
              {
                p2.val = sum;
                p1.next = p2;
                p2 = p2.next;
            }
                p1 = p1.next;
            
        }
        return dummy.next;
        
    }
}