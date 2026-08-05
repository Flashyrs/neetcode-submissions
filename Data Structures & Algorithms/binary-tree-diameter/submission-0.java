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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        int [] dia = new int[1];
        func(root, dia);
        return dia[0];
    }
    public int func(TreeNode root, int [] dia){
        if(root == null)
            return 0;
        int lh = func(root.left, dia);
        int rh = func(root.right, dia);
        dia[0] = Math.max(dia[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
