class Solution {
    public int missingNumber(int[] nums) {
       int Expectedsums = 0;
       int Realsums = 0;
        for (int i = 0; i <= nums.length; ++i) {
            Expectedsums += i;
        } 
        for (int i = 0; i < nums.length; ++i) {
            Realsums += nums[i]; 
        }
        return Expectedsums - Realsums;
    }
}