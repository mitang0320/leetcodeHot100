package com.cannedmitang.hot100;

public class _0079_Exist {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        final char[] chars = word.toCharArray();
        for ( int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                final boolean process = process(board, chars, i , j , 0);
                if(process) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean process(char[][] board, char[] word, int i, int j , int index) {
        if(index == word.length) {
            return true;
        }
        if ( i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        if (board[i][j] == word[index]) {
            board[i][j] = (char)(-board[i][j]);
            boolean p1 = process(board,word,i-1,j,index+1);
            boolean p2 = process(board,word,i+1,j,index+1);
            boolean p3 = process(board,word,i,j-1,index+1);
            boolean p4 = process(board,word,i,j+1,index+1);
            board[i][j] = (char)(-board[i][j]);
            return p1 || p2 || p3 || p4;
        } else {
            return false;
        }
    }

}
