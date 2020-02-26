class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];//default is current unvisited 
        Arrays.sort(nums);
        helper(nums, set, result,flag);
        return result;
    }
    private void helper(int[]nums, List<Integer>set,List<List<Integer>>result,boolean[] flag){
        if(set.size()==nums.length){
            result.add(new ArrayList<>(set));
        }
        // if current i is visiting, means regular situation,then continue
        //or nums[i]==nums[i-1] and i-1 was visited
        //which means we have same value but different index, still continue
        for(int i =0 ; i < nums.length; i ++){
            if(flag[i] || i>0 && nums[i] ==nums[i-1] && !flag[i-1]){
                continue;
            }
            flag[i] = true; // set current i was visited
            set.add(nums[i]);
            helper(nums,set,result,flag);
            set.remove(set.size()-1);
            flag[i] = false;//set back to initial value
        }
        
    }
}