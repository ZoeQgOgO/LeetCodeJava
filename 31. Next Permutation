class Solution {
    public void nextPermutation(int[] nums) {
        int p = -1;
        for(int i = nums.length-1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                p = i-1;
                break;
            }
        }
        if(p == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        int q = nums.length-1;
        for(int i =nums.length-1; i >= p+1; i--){
            if(nums[i] > nums[p]){
                q=i;
                break;
            }
        }
        swap(nums, p, q);
        reverse(nums, p+1, nums.length-1);
    }
    private void swap(int[] nums, int i , int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j]=t;
    }
    private void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}