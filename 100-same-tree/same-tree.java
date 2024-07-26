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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return isSameTreeHelper(p,q);
    }
    public static boolean isSameTreeHelper(TreeNode p,TreeNode q)
    {
        if(p == null && q == null)
            return true;
        if((p == null || q == null) || (p.val != q.val))
            return false;
        
        return isSameTreeHelper(p.left,q.left) && isSameTreeHelper(p.right,q.right);
    }
    //BY GANESH JAGGINENI
}   