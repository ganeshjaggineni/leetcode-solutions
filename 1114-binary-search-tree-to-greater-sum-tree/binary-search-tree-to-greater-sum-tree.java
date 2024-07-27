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
    private static int sum;
    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        bstToGstHelper(root);
        return root;
    }
    public static void bstToGstHelper(TreeNode root)
    {
        if(root == null)
            return;
        bstToGstHelper(root.right);
        sum = sum+root.val;
        root.val = sum;
        bstToGstHelper(root.left);
    }
    //BY GANESH JAGGINENI
}