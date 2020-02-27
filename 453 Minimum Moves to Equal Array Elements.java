class Solution {
    public int minMoves(int[] nums) {
        int sum = 0; 
        int n = nums.length;
        int min = nums[0];
        for(int i =0; i < n; i++){
            sum += nums[i];
            if(nums[i] < min) min = nums[i];
        }
        return sum - n*min;
    }
}