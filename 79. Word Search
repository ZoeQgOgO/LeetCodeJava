class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length ==0|| board[0].length == 0) return false;
        for(int i =0; i < board.length; i++){
            for(int j =0; j < board[0].length;j++){
                if(check(board, i, j, 0, word)) return true;
            }
        }
        return false;
    }
    private boolean check(char[][] board, int i , int j, int c, String word){
        if(c==word.length()) return true;
        if(i<0||i >= board.length) return false;
        if(j < 0|| j >= board[0].length) return false;
        char temp = board[i][j];
        if(board[i][j] == word.charAt(c)){
            board[i][j] ='#';//mark it as visited
            //check next c of word in matrix neighbor
            if(check(board, i +1, j, c+1, word) ||check(board, i-1, j, c+1,word) || check(board, i, j-1, c+1, word)||check(board, i, j+1, c+1, word)) return true;
            board[i][j] = temp;
        }
        return false;
    }
}