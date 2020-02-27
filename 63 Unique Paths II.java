class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowLen = obstacleGrid.length;
        int colLen = obstacleGrid[0].length;
        for(int i =0; i < rowLen; i++){
            for(int j =0 ; j < colLen;j++){
                if(i==0 && j==0){
                    if (obstacleGrid[i][j]==1) {
                        return 0;
                    }else{
                        obstacleGrid[i][j]=1;
                    }
                }else if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=0;
                }else if(i>0 &&j==0){
                    obstacleGrid[i][j]=obstacleGrid[i-1][j];
                }else if(j>0 && i==0){
                    obstacleGrid[i][j]=obstacleGrid[i][j-1];
                }else {
                    obstacleGrid[i][j] = obstacleGrid[i][j-1] +obstacleGrid[i-1][j];
                }
            }
        }
        return obstacleGrid[rowLen-1][colLen-1];
    }
}