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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        levelRecord(root, result, 0);
        return result;
    }
    public void levelRecord(TreeNode node, LinkedList<List<Integer>> result, int level){
        if(node == null) return;
        if(result.size() < level +1) {
            result.addFirst(new ArrayList<Integer>());
        }
        result.get(result.size() - 1 - level).add(node.val);
        
        levelRecord(node.left, result, level +1);
        levelRecord(node.right, result, level +1);
    }
}