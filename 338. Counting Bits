class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num +1];
        for(int i =0; i <= num; i++){
            int val = i;
            int count =0;
            while(val!=0){
                if((val&1)==1){
                    ++count;
                }
                val = val>>1;
            }
            result[i] = count;
        }
        return result;
    }
}