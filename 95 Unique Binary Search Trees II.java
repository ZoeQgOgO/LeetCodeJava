import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
       if(n ==0) return new ArrayList<>();
        else return recursion(1,n);
    }
    public List<TreeNode> recursion(int l, int r){
        List<TreeNode> result = new ArrayList<>();
        if(l > r|| l < 0){
            result.add(null);
        }
        if(l==r){
            result.add(new TreeNode(l));
            return result;
        }
        for(int i =l; i <=r; i++){
            List<TreeNode>left = recursion(l, i-1);
            List<TreeNode>right = recursion(i+1,r);
            
            for(TreeNode ln:left){
                for(TreeNode rn:right){
                    TreeNode root = new TreeNode(i);
                    root.left = ln;
                    root.right = rn;
                    result.add(root);
                }
            }
        }
        return result;
    }
  
}