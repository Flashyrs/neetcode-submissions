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
    public int goodNodes(TreeNode root) {
        int maxVal = root.val;
        return func(root, maxVal);
    }
    public int func(TreeNode root, int maxVal){
        if(root == null)
            return 0;
        int res = maxVal <= root.val ? 1 : 0;
        maxVal = Math.max(maxVal, root.val);
        res += func(root.left, maxVal);
        res += func(root.right, maxVal);
        return res;
    }
}
