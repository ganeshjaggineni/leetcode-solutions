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
    public int sumRootToLeaf(TreeNode root) {
        sum = 0;
        sumRootToLeafHelper(root,0);
        return sum;
    }
    public static void sumRootToLeafHelper(TreeNode root,int num)
    {
        if(root == null)
            return;
        num = num<<1 | root.val;
        if(root.left == null && root.right == null)
        {
            sum = sum + num;
        }


        sumRootToLeafHelper(root.left,num);
        sumRootToLeafHelper(root.right,num);

    }
  //BY GANESH JAGGINENI
}