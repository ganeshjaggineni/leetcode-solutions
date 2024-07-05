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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode prev = head;
        ListNode curr = head.next;
        int len = 1;
        ListNode next = curr;
        int first_crit_point = 0;
        int last_crit_point = 0;
        int last_before_crit_point = 0;
        int crit_count = 0;
        boolean firstCritPoint = false;
        int min_dist = Integer.MAX_VALUE;
        while(curr.next != null)
        {
            len++;
            next = curr.next;
            if( (curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val ))
            {
                if(!firstCritPoint)
                {
                    first_crit_point = len;
                    firstCritPoint = true;
                }
                last_before_crit_point = last_crit_point;
                last_crit_point = len;
                crit_count++;
                if(crit_count >= 2)
                         min_dist = Math.min(min_dist,last_crit_point - last_before_crit_point);
            }
            prev = curr;
            curr = curr.next;
        }
        int arr[] = new int[2];
        if(crit_count < 2)
        {
            arr[0] = -1;
            arr[1] = -1;
        }
        else
        {
            arr[0] = min_dist;
            arr[1] = last_crit_point - first_crit_point;
        }
        return arr;
        
    }
}