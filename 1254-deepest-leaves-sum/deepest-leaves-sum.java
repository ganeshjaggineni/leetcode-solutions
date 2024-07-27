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
    private static int maxDepth;
    public int deepestLeavesSum(TreeNode root) {
        sum = 0;
    
        maxDepth = findMaxDepth(root);
        deepestLeavesSumHelper(root,0);
        // System.out.println(maxDepth);
        return sum;
    }
    public static int findMaxDepth(TreeNode root)
    {
        if(root == null)
            return -1;
       int leftDepth =  findMaxDepth(root.left);
        int rightDepth = findMaxDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
    public static void deepestLeavesSumHelper(TreeNode root,int depth)
    {
        if(root == null)
            return;
       
        if(root.left == null && root.right == null)
            {
                if(depth == maxDepth)
                    sum += root.val;
            }
        deepestLeavesSumHelper(root.left,depth+1);
        deepestLeavesSumHelper(root.right,depth+1);
    }
    //BY GANESH JAGGINENI
}