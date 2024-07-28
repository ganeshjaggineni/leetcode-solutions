/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int sum;
    static int num;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        num = 0;
        sumNumbersHelper(root);
        return sum;
        
    }
    public static void sumNumbersHelper(TreeNode root)
    {
        if(root == null)
        {
                return;
        }
        num = num*10+root.val;
        if(root.left == null && root.right == null)
        {
            sum += num;
        }
        sumNumbersHelper(root.left);
        sumNumbersHelper(root.right);
        num /= 10;
    }
    //BY GANESH JAGGINENI
}