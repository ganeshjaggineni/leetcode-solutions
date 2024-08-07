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
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> maxList = new ArrayList<>();
        if(root == null)
            return maxList;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            int maxVal = Integer.MIN_VALUE;
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                maxVal = Math.max(maxVal,node.val);
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                
            }
            maxList.add(maxVal);
        }
        return maxList;
        
    }
    //BY GANESH JAGGINENI
}