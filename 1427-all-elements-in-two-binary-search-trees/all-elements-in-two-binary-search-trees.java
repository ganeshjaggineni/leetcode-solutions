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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> sortedList = new ArrayList<>();
        getAllElementsHelper(root1,sortedList);
        getAllElementsHelper(root2,sortedList);
        Collections.sort(sortedList);
        return sortedList;
        
    }
    public static void getAllElementsHelper(TreeNode root,List<Integer> sortedList)
    {
        if(root == null)
            return ;
        getAllElementsHelper(root.left,sortedList);
        
            sortedList.add(root.val);
        getAllElementsHelper(root.right,sortedList);
    }
    //BY GANESH JAGGINENI
}