import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target){
        if(nums.length == 0|| nums == null) return target;
        int res = 0;
        boolean flag = true;
        Arrays.sort(nums);
        for(int i =0;i < nums.length;i++){
            int left = i+1;
            int right = nums.length -1;
            while(left < right){
                int sum = nums[i] +nums[left] +nums[right];
                if(flag){
                    res = sum;
                    flag = false;
                }else if(Math.abs(sum -target) < Math.abs(res - target)){
                    res = sum;
                }
                if(sum < target){
                    left ++;
                }else{
                    right --;
                }
            }
        }
        return res;
    }
}