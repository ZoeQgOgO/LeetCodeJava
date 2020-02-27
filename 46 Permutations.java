import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        helper(nums, set, result);
        return result;
    }
    private void helper(int[] nums, List<Integer> set, List<List<Integer>> result){
        if(set.size() == nums.length){
            result.add(new ArrayList<>(set));
        }
        for(int num:nums){
            if(set.contains(num)){
                continue;
            }
            set.add(num);
            helper(nums,set, result);
            set.remove(set.size()-1);
        }
    }
}