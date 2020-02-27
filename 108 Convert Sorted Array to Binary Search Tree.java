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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return BTree(nums, 0 , nums.length -1);
    }
    public TreeNode BTree(int[] nums, int start, int end){
        if(start > end) return null;
        int mid = (start + end) /2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BTree(nums, start, mid -1);
        root.right = BTree(nums, mid +1, end);
        return root;
    }
}