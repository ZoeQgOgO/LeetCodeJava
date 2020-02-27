import java.util.ArrayList;
import java.util.List;

public class TreeNode { int val; TreeNode
 left; TreeNode right; TreeNode(int x) { val = x; } 
}
 
class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) { 
        inorder(root);
        return list;
    }
    public void inorder(TreeNode node){
        if(node == null) return;
        if(node.left != null) {
            inorder(node.left);
        }
        list.add(node.val);
        if(node.right != null){
            inorder(node.right);
        }
    }
}