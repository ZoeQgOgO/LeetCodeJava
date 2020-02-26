class Solution {
    public int rob(int[] nums) {
        int rob = 0;//if rob current house
        int notrob = 0;// not rob current house
        for (int i = 0; i < nums.length; i++) {
            int currob = notrob + nums[i];
            notrob = Math.max(notrob,rob);
            rob = currob;     
        }
        return Math.max(rob, notrob);
        
    }
}