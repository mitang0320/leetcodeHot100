package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.List;

public class _0054_spiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;

        int size = col * row;
        final ArrayList<Integer> res = new ArrayList<>();
        int step = 0;
        while(res.size() < size) {
            process(matrix, step++, res);
        }
        return res;
    }

    private void process(int[][] matrix, int step, List<Integer> res) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = step;
        int bottom = m - step - 1;
        int left = step;
        int right = n - step - 1;

        for (int i = left; i <= right && res.size()< n * m ; i++) {
            res.add(matrix[top][i]);
        }
        for (int i = top + 1; i <= bottom && res.size() < n * m; i++) {
            res.add(matrix[i][right]);
        }
        for (int i = right - 1; i >= left && res.size() < n * m ; i--) {
            res.add(matrix[bottom][i]);
        }
        for (int i = bottom - 1; i > top && res.size() < n * m; i--) {
            res.add(matrix[i][left]);
        }
    }

}
