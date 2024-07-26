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
    public boolean hasPathSum(TreeNode root, int targetSum) {

        int sum = 0;
        return hasPathSumHelper(root,sum,targetSum);
        
    }
    public static boolean hasPathSumHelper(TreeNode root,int sum,int target)
    {
        if(root == null)
            return false;
        sum += root.val;
       if(root.left == null && root.right == null)
            return sum == target;
        return hasPathSumHelper(root.left,sum,target) || hasPathSumHelper(root.right,sum,target);
    }
    //BY GANESH JAGGINENI
}