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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> rootToLeafPaths = new ArrayList<>();
        
       binaryTreePathsHelper(root,"",rootToLeafPaths);
       return rootToLeafPaths;
    }
    public static void binaryTreePathsHelper(TreeNode root,String path,List<String> rootToLeafPaths)
    {
        if(root == null)
            return ;
        path = path + Integer.toString(root.val);
        if(root.left == null && root.right == null)
            rootToLeafPaths.add(path);
        path += "->";

        binaryTreePathsHelper(root.left,path,rootToLeafPaths);
        binaryTreePathsHelper(root.right,path,rootToLeafPaths);
    }
    //BY GANESH JAGGINENI
}