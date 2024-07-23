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
    public int findTilt(TreeNode root) {
        sum = 0;
        findTiltHelper(root);
        return sum;
    }
    public static int findTiltHelper(TreeNode root)
    {
        if(root == null)
            return 0;
        int left = findTiltHelper(root.left);
        int right = findTiltHelper(root.right);
        sum = sum+(Math.abs(left-right));
        return left+right+root.val;
    
    }
    //BY GANESH JAGGINENI
}