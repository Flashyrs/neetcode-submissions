class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int row = 0; row < 9; row++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < 9 ; j++){
                if(board[row][j] == '.')
                    continue;
                if(set.contains(board[row][j]))
                    return false;
                set.add(board[row][j]);
            }
        }
        for(int col = 0; col < 9; col++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < 9 ; j++){
                if(board[j][col] == '.')
                    continue;
                if(set.contains(board[j][col]))
                    return false;
                set.add(board[j][col]);
            }
        }
        for(int sr = 0; sr < 9 ; sr += 3){
            for(int sc = 0; sc < 9; sc += 3){
                int er = sr + 2;
                int ec = sc + 2;
                if(!check(board, sr, er, sc, ec))
                    return false;
            }
        }
        return true;
    }
    public boolean check(char [][] board, int sr, int er, int sc, int ec){
        Set<Character> set = new HashSet<>();
        for(int i = sr; i <= er ; i++){
            for(int j = sc; j <= ec; j++){
                if(board[i][j] == '.')
                    continue;
                if(set.contains(board[i][j]))
                    return false;
                set.add(board[i][j]);
            }
        }
        return true;
    }
}
