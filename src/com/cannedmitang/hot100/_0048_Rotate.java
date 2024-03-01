package com.cannedmitang.hot100;

public class _0048_Rotate {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n - i * 2 - 1; j++) {
                swap(matrix, i , j);
            }
        }
    }

    public void swap(int[][] matrix, int layer, int step) {
        int n = matrix.length;
        int x1 = layer + step;
        int y1 = layer;

        int x2 = (n - 1) - layer;
        int y2 = layer + step;

        int x3 = (n - 1) - (layer + step);
        int y3 = (n - 1) - layer;

        int x4 = layer;
        int y4 = (n - 1) - (layer + step);
        swap(matrix, x1, y1, x2, y2, x3, y3, x4, y4);

    }

    public void swap(int[][] matrix, int x1, int y1,
                     int x2, int y2,
                     int x3, int y3,
                     int x4, int y4
                     ) {
        int t = matrix[y1][x1];
        matrix[y1][x1] = matrix[y4][x4];
        matrix[y4][x4] = matrix[y3][x3];
        matrix[y3][x3] = matrix[y2][x2];
        matrix[y2][x2] = t;
    }


}
