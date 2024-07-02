/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode curr1 = headA;
        
       while(curr1 != null)
       {
        ListNode curr2 = headB;
        while(curr2 != null)
        {
            if(curr1 == curr2)
            {
                System.out.println("curr 1 data = "+curr1.val+"curr2 data "+curr2.val);
                return curr1;
            }
            curr2 = curr2.next;
        }
        curr1 = curr1.next;
       }
       return null;
       
    }
}