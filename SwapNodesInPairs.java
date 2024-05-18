/*
24. Swap Nodes in Pairs
Solved
Medium
Topics
Companies
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 

Example 1:


Input: head = [1,2,3,4]
Output: [2,1,4,3]
Example 2:

Input: head = []
Output: []
Example 3:

Input: head = [1]
Output: [1]
 

Constraints:

The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100
*/
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
   
    public ListNode swapPairs(ListNode head) {

        //recursive method 
         ListNode adjacent_node = null;
         ListNode remaining_node_head = null;
        if(head == null || head.next == null)  //base case when there is only one node or no node 
            return head;
        remaining_node_head = head.next.next;  //this head node  passes to recursion,it takes care and gives the head's address
        adjacent_node = head.next;//stores second node address
        adjacent_node.next = head;//converts second node's address to first node
        head.next = swapPairs(remaining_node_head);//the recursion returned address is map to respective first nodes
        return adjacent_node;  

        //method 2 (Don't care about leetcode note )
        //opposite to leetcode mentioned approach
        //swap the values of adjacent nodes iteratively

        // if(head == null || head.next == null)
        //     return head;
        // ListNode temphead = head;
        // ListNode current = head;
        // ListNode nextnode;
       
        // int temp;
        // while(current != null && current.next != null)
        // {
        //     nextnode = current.next;
        //     //swap logic
        //     temp = current.val;
        //     current.val = nextnode.val;
        //     nextnode.val = temp;

        //     current = nextnode.next;
           

        // }
        // return temphead;
    }
    //BY JAGGINENI GANESH
}
