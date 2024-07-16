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
    public List<List<Integer>> levelOrder(TreeNode root) {


        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> anslist = new ArrayList<>();
        if(root == null)
            return anslist;
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                sublist.add(node.val);
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right); 
                
            }
            anslist.add(sublist);
        }
        return anslist;
        
    }
    //BY GANESH JAGGINENI
}