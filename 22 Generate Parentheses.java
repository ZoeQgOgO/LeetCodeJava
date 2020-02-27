import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Srting> generateParenthesis(int n) {
        List<Srting> result = new ArrayList<>();
        helper("(", 1, 0, n, result);
        return result;
    }
    
    private void helper(String string, int left, int right, int n, List<Srting> result) {
        if (left < n) {
            helper(string + "(", left + 1, right, n, result);
        }
        if (right < left) {
            helper(string + ")", left, right + 1, n, result);
        }
        if (left == n && right == n) {
            result.addAll(string);
        }
    }
}