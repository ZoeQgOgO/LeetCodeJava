import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check 9*9
        for(int i =0; i < 9;i++){//check row
            if(isValidBoard(board, i,i,0,8)==false){
                return false;
            }
        }
        for(int j =0; j < 9;j++){//check col
            if(isValidBoard(board,0,8,j,j)==false){
                return false;
            }
        }
        //check 3*3 sub box
        for(int i =0; i < 3; i++){
            for(int j =0; j < 3; j++){
                if(isValidBoard(board,3*i, 3*i+2, 3*j, 3*j+2)==false){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValidBoard(char[][] board, int rowStart, int rowEnd, int colStart, int colEnd){
        Set<Character> set = new HashSet<Character>();
        for(int i =rowStart; i <= rowEnd; i ++){
            for(int j = colStart; j <= colEnd; j++){
                if(set.contains(board[i][j])){
                    return false;
                }else if(board[i][j]!='.'){
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
}