class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length < 3){
            int max = Integer.MIN_VALUE;
            for(int n : nums){
                if(n > max){
                    max = n;
                }
            }
            return max;
        }else{
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int max3 = Integer.MIN_VALUE;
            int flag =0;
            for(int n : nums){
                if(n == Integer.MIN_VALUE) flag =1;
                if(n > max1){
                    max3 = max2;
                    max2 = max1;
                    max1 = n;
                }else if(n > max2 && n != max1){
                    max3 = max2;
                    max2 = n;
                }else if(n > max3 && n!=max1 && n!=max2){
                    max3 = n;
                }
            }
            return max3 == Integer.MIN_VALUE && flag == 0 || max2 == Integer.MIN_VALUE?max1:max3;
        }
    }
}