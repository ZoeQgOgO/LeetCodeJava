import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if(root != null) TreePath(root, "", result);
        return result;
    }
    private void TreePath(TreeNode root, String path, List<String> result){
        if(root.left == null && root.right == null) result.add(path + root.val);
        if(root.left != null) TreePath(root.left, path + root.val + "->", result);
        if(root.right != null) TreePath(root.right, path + root.val + "->", result);
        
    }
}