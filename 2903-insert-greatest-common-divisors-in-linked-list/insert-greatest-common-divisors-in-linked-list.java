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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode curr = head;
        while(curr.next != null)
        {
           
            int gcd = findGcd(curr.val,curr.next.val);
            ListNode newNode = new ListNode(gcd);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = curr.next.next;
        }
        return head;
    }
    public int findGcd(int num1,int num2)
    {
        int gcd = 0;
        if(num1 >= num2)
        {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
           
        for(int i=num2;i>=1;i--)
        {
            if(num1%i == 0 && num2%i == 0)
            {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}