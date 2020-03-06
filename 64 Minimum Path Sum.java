class Solution{
    public int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] res = new int[m][n];
        res[0][0] = grid[0][0];

        for(int i =1; i < n;i++){
            res[0][i] = res[0][i-1] + grid[0][i];
        }
        for(int j =1; j <m;j++){
            res[j][0] = res[j-1][0] + grid[j][0];
        }
        for(int i =1; i < m ;i++){
            for(int j =1; j < n; j++){
                if(res[i-1][j]<res[i][j-1]){
                    res[i][j] = res[i-1][j] + grid[i][j];
                }else{
                    res[i][j] = res[i][j-1] + grid[i][j];
                }
            }
        }
        return res[m-1][n-1];
    }
}