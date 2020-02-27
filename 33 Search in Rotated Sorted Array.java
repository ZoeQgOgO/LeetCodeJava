class Solution {
    public int search(int[] nums, int target) {
        // iteration
        int left = 0;
        int right = nums.length -1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target == nums[mid])
                return mid;
            if(nums[left] <= nums[mid]){ //poiter in right side
                if(nums[left] <= target && target < nums[mid]){
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
            }else{ //pointer in left side
                if(nums[mid] < target && target <= nums[right]){
                    left = mid +1;
                }else{
                    right = mid -1;
                }
            }
        }
        return -1;
    }    
}