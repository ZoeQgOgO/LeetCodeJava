class Solution {
    public List<String> generateParenthesis(int n) {
        List<Srting> result = new ArrayList<>();
        helper("(", 1, 0, n, result);
        return result;
    }
    private void helper(String s, int left, int right, int n , List<String> result){
        if(left < n){
            helper(s+"(", left +1, right, n, result); 
        }
        if(right < left){
            helper(s+")", left, right +1, n, result);
        }
        if(left == n && right ==n){
            result.add(s);
        }
    }
}