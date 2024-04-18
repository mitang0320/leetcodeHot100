package com.cannedmitang.hot100;

public class _0074_SearchA2dMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;
        int res = -1;
        while ( l <= r) {
            int m = l +(( r - l) >> 1);
            if (matrix[m][0] == target) {
                res = m;
                l = m+1;
            } else if (matrix[m][0] > target) {
                r = m - 1;
            } else if (matrix[m][0] < target) {
                res = m;
                l = m + 1;
            }
        }
        if (res < 0) {
            return false;
        }
        int[] line = matrix[res];
        l = 0;
        r = line.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (line[mid] == target) {
                return true;
            } else if (line[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

}
