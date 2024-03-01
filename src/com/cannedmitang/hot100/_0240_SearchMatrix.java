package com.cannedmitang.hot100;

public class _0240_SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int x = m - 1;
        int y = 0;
        while (x >= 0 && y < n) {
            int curr = matrix[y][x];
            if (curr == target) {
                return true;
            }
            if (curr < target) {
                y++;
            } else {
                x--;
            }
        }
        return false;
    }

}
