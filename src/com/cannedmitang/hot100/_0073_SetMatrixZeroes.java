package com.cannedmitang.hot100;

public class _0073_SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;

        boolean isFirstColZero = false;
        for (int y = 0; y < row ; y++) {
            if (matrix[0][y] == 0) {
                isFirstColZero = true;
            }
        }
        boolean isFirstRowZero = false;
        for ( int x = 0; x < col; x++) {
            if (matrix[x][0] == 0) {
                isFirstRowZero = true;
            }
        }
        for (int y = 1; y < row ; y++) {
            for (int x = 1; x < col; x++) {
                if(matrix[x][y] == 0) {
                    matrix[x][0] = 0;
                    matrix[0][y] = 0;
                }
            }
        }
        for (int y = 1; y < row ; y++) {
            for (int x = 1; x < col; x++) {
                if (matrix[x][0] == 0 || matrix[0][y] == 0) {
                    matrix[x][y] = 0;
                }
            }
        }
        if (isFirstColZero) {
            for (int y = 0; y < row; y++) {
                matrix[0][y] = 0;
            }
        }
        if (isFirstRowZero) {
            for (int x = 0; x < col; x++) {
                matrix[x][0] = 0;
            }
        }

    }

}
