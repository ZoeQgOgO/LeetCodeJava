/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root,root);
    }
    public boolean mirror(TreeNode left, TreeNode right){
        if((left == null && right != null) ||(left != null && right == null)) return false;
        if(left == null && right == null) return true;
        if(left.val != right.val) {
            return false;
        }else {
            return mirror(left.left,right.right) && mirror(left.right, right.left);
        }
    }
}