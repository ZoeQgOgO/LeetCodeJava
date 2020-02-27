import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        if(n <=0 || n < k) return result;
        dfs(n,k,1,result,temp);
        return result;
    }
    public void dfs(int n , int k, int start, List<List<Integer>>result, List<Integer>temp){
        if(temp.size() == k){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i <= n; i++){
            temp.add(i);
            dfs(n,k,i +1, result, temp);
            temp.remove(temp.size()-1);
        }
    }
}