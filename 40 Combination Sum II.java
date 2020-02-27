class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        if(candidates == null || candidates.length == 0){
            return result;
        }
        Arrays.sort(candidates);
        dfs(sum, result, candidates, target, 0);
        return result;
    }
    private void dfs(List<Integer> sum, List<List<Integer>> result, int[] candidates, int target, int index){
        if(target ==0){
            result.add(new ArrayList<>(sum));
            return;
        }
        for(int i = index; i < candidates.length; i ++){
            if(i != index && candidates[i] == candidates[i-1]){
                continue;
            } // check same value with different index
            if(candidates[i] > target){
                break;
            }
            sum.add(candidates[i]);
            dfs(sum, result, candidates, target - candidates[i], i+1);
            sum.remove(sum.size()-1);
        }
    }
}