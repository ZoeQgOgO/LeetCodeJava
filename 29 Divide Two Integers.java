class Solution{
    public int divide(int dividend, int divisor){
        if(divisor == 0) return Integer.MAX_VALUE;
        if(divisor ==1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        long a = Math.abs((long) dividend); // get positive input
        long b = Math.abs((long) divisor);
        int result = 0;
        while(a>=b){
            int shift = 0;
            while(a>=(b << shift)){ //left shift
                shift ++;
            }
            result += 1 << (shift -1);
            a -= b << (shift -1);
        }
        if((dividend >0 && divisor > 0) ||(dividend < 0 && divisor < 0)){
            return result;
        }else{
            return -result;
        }
       
    }
}