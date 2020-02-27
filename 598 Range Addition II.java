class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length < 1) return m*n;
        int min_n = Integer.MAX_VALUE;
        int min_m = Integer.MAX_VALUE;
        for(int i =0; i <ops.length; i++){
            m = ops[i][0];
            n = ops[i][1];
            min_m = Math.min(m, min_m);
            min_n = Math.min(n, min_n);
        }
        return min_m * min_n;
    }
}
