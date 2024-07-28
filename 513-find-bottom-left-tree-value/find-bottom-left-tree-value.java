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
    static int maxDepth;
    static int bottomLeftMostVal;
    public int findBottomLeftValue(TreeNode root) {
        maxDepth = 0;
        bottomLeftMostVal = root.val;
        findBottomLeftValueHelper(root,0);
        return bottomLeftMostVal;
    }
    public static void findBottomLeftValueHelper(TreeNode root,int depth)
    {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
        {
            if(depth > maxDepth)
            {
                maxDepth = depth;
                bottomLeftMostVal = root.val;
            }
        }
        findBottomLeftValueHelper(root.left,depth+1);
        findBottomLeftValueHelper(root.right,depth+1);
    }
    //BY GANESH JAGGINENI
}