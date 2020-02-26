class Solution{
    public int removeDuplicates(int[] nums){
        int len = 0;
        if(nums.length == 0) return 0;
        for(int i =0; i < nums.length;i++){
            if(nums[len] !=nums[i]){
                len++;
                nums[len] = nums[i];
            }
        }
        return len +1;
    }
}