import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i =0;
        for(int num:nums){
            if(map.containsKey(target - num)){
                return new int[]{map.get(target-num),i};
            }
            map.put(num,i);
            ++i;
        }
        return new int[]{0};
    }
}

class Solution1 {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int i =0; i < nums.length-1;i++){
            for(int j = i+1; j <nums.length;j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}