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
    public List<Integer> preorderTraversal(TreeNode root) {

        //method 1 USING RECURSION
        /*
        List<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        return ans;
        */

        //METHOD 2 iterative way using stack
        Stack<TreeNode> treestack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        treestack.add(root);
        if(root == null)
            return res;
        while(!treestack.isEmpty())
        {
            TreeNode top = treestack.pop();
            if(top != null)
                res.add(top.val);
            if(top.right != null)
                treestack.add(top.right);
            if(top.left != null)
                treestack.add(top.left);
        }
        return res;
    }
    /*
    private static void preorder(TreeNode root,List<Integer> ans)
    {
        if(root == null)
            return ;
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    */
}