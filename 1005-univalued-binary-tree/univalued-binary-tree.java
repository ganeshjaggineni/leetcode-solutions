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
    public boolean isUnivalTree(TreeNode root) {

        return checkUnivalTree(root,root.val);
       
        
    }
    public static boolean checkUnivalTree(TreeNode root,int value)
    {
        if(root == null)
            return true;
        if(root.val != value)
            return false;
        return checkUnivalTree(root.left,value) && checkUnivalTree(root.right,value);
     

    }
}