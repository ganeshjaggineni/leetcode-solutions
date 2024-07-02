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

/*
        ListNode curr1 = headA;
        
       while(curr1 != null)
       {
        ListNode curr2 = headB;
        while(curr2 != null)
        {
            if(curr1 == curr2)
            {
                return curr1;
            }
            curr2 = curr2.next;
        }
        curr1 = curr1.next;
       }
       return null;

    */
    //METHOD 2 USING HASHSET TO STORES NODES
        Set<ListNode> store_nodes = new HashSet<>();
        
        while(headA != null)
        {
            store_nodes.add(headA);
             headA = headA.next;
        }
        while(headB != null)
        {
            if(store_nodes.contains(headB))
                return headB;
            headB = headB.next;
        }
        return null;
    }
}