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
    int paths =0;
    public int pathSum(TreeNode root, int sum) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode curNode;
        if(root == null) return 0;
        queue.add(root);
        while(!queue.isEmpty()){
            curNode = queue.poll();
            findPath(curNode, sum);
            if(curNode.left != null) queue.add(curNode.left);
            if(curNode.right != null) queue.add(curNode.right);
        }
        return paths;
    }
    public void findPath(TreeNode root, int sum){
        if(root == null) return;
        if(root.val == sum) paths ++;
        
        findPath(root.left, sum - root.val);
        findPath(root.right, sum - root.val);
    }
    
}
