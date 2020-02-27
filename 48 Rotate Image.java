class Solution {
    public void rotate(int[][] matrix) {
        for(int i =0; i<matrix.length/2;i++){
            for(int j =i; j < matrix.length -i -1;j++){
                swap(matrix, i, j);
            }
        }
    }
    private void swap(int[][] matrix, int i, int j){
        int len = matrix.length;
        int temp = matrix[i][j];
        matrix[i][j] = matrix[len-1-j][i];
        matrix[len-j-1][i] = matrix[len-1-i][len-1-j];
        matrix[len-1-i][len-1-j] = matrix[j][len-1-i];
        matrix[j][len-1-i] = temp;
    }
}