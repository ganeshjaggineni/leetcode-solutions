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
    public boolean evaluateTree(TreeNode root) {
        
        if(root.left == null && root.right == null)
        {
            return root.val == 1;         
        }
        boolean leftsubtree = evaluateTree(root.left);
        boolean rightsubtree = evaluateTree(root.right);
        if(root.val == 2)
            return leftsubtree||rightsubtree;
        else if(root.val == 3)
            return leftsubtree && rightsubtree;
        return false;
    }
    //BY GANESH JAGGINENI
}