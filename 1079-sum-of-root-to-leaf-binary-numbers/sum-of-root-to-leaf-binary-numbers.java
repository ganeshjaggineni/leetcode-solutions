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
            System.out.println("num = "+num);
            // sum = sum + converToDecimal(num);
            sum = sum + num;
        }


        sumRootToLeafHelper(root.left,num);
        sumRootToLeafHelper(root.right,num);

    }
    public static int converToDecimal(int num)
    {
        int len = 0;
        int decimalNum = 0;
        while(num > 0)
        {
            int last_dig = num%10;
            decimalNum += (1<<len)*last_dig;
            num /= 10;
            len++;

        }
        // System.out.println("decimal num "+decimalNum);
        return decimalNum;
    }
}