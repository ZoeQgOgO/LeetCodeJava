import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length <4) return result;
        Arrays.sort(nums);
        for(int i =0; i < nums.length-3;i++){
            if(i!=0 && nums[i]==nums[i-1])
            continue;
            for(int j =i+1; j < nums.length-2;j++){
                if(j!=i+1 && nums[j] == nums[j-1])
                continue;

                int left = j+1;
                int right = nums.length-1;

                while(left < right){
                    if(nums[i] + nums[j] + nums[left] +nums[right] < target){
                        left ++;
                    }else if(nums[i] + nums[j] + nums[left] +nums[right] > target){
                        right --;
                    }else{
                        List<Integer> set = new ArrayList<>();
                        set.add(nums[i]);
                        set.add(nums[j]);
                        set.add(nums[left]);
                        set.add(nums[right]);

                        result.add(set);

                        left ++;
                        right --;

                        while(left < right && nums[right] == nums[right+1]){
                            right--;
                        }
                        while(left < right && nums[left] == nums[left-1]){
                            left ++;
                        }
                    }
                }
            }
        }
        return result;
    }
}