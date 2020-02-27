import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }
       return helper(matrix, 0, 0, matrix.length, matrix[0].length);
    }
    private List<Integer> helper(int[][] matrix, int x, int y, int row, int col){
        List<Integer> result = new ArrayList<>();
        if(row <=0 || col<=0){
            return result;
        }
        //the last one
        if(row ==1 && col ==1){
            result.add(matrix[x][y]);
            return result;
        }
        //move right
        for(int i =0; i < col -1; i ++){
            result.add(matrix[x][y++]);
        }
        //move down
        for(int i =0; i < row -1; i++){
            result.add(matrix[x++][y]);
        }
        //move left
        if(row >1){
            for(int i =0; i < col -1; i++){
                result.add(matrix[x][y--]);
            }
        }
        //move up
        if(col >1){
            for(int i =0; i < row-1; i++){
                result.add(matrix[x--][y]);
            }
        }
        if(row ==1 || col ==1){
            result.addAll(helper(matrix,x,y,1,1));
        }else{
            result.addAll(helper(matrix, x+1,y+1,row -2, col -2));
        }
        return result;
    }
}