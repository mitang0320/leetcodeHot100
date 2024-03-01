package com.cannedmitang.hot100;

/**
 * @author : loso
 * @version : v1.0
 * @date : Created in 2023/11/14 10:59
 * @description :
 * @modified By : loso
 */
public class _0994_RottingOranges {

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int step = 0;
        int count = count(grid);
        int lastCount = -1;
        while(count > 0) {
            if (lastCount == count) {
                return -1;
            }
            step++;
            for (int y = 0; y < m; y++) {
                for (int x = 0; x < n; x++) {
                    if (grid[y][x] == 2) {
                        infect(grid, x, y);
                    }
                }
            }
            lastCount = count;
            count -= flash(grid);
        }
        return step;
    }

    public int flash(int [][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int y = 0; y < m ; y++) {
            for (int x = 0; x < n; x++) {
                if ( grid[y][x] == -2) {
                    count++;
                    grid[y][x] = 2;
                }
            }
        }
        return count;
    }

    public void infect(int[][] grid, int x, int y) {
        int m = grid.length;
        int n = grid[0].length;

        if (x < 0 || x >= n) {
            return;
        }
        if (x < 0 || y >= m) {
            return;
        }
        if ( grid[y][x] == 2) {
            mark(grid, x + 1, y);
            mark(grid, x - 1,y);
            mark(grid, x , y + 1);
            mark(grid, x , y - 1);
        }
    }

    public void mark(int[][] grid, int x , int y) {
        int m = grid.length;
        int n = grid[0].length;
        if ( x < 0 || x >= n) {
            return;
        }
        if ( y < 0 || y >= m) {
            return;
        }
        if (grid[y][x] == 1) {
            grid[y][x] = -2;
        }
    }

    public int count(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if ( grid[y][x] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

}
