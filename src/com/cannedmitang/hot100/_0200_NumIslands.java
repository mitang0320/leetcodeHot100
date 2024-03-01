package com.cannedmitang.hot100;

public class _0200_NumIslands {

    public int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int y = 0; y < m; y++) {
            for ( int x = 0; x < n ; x++) {
                if ( grid[y][x] == '1') {
                    res++;
                    infect(grid, x , y);
                }
            }
        }
        return res;
    }

    public void infect(char[][] grid, int x , int y) {
        int m = grid.length;
        int n = grid[0].length;
        if ( x< 0 || x >= n) {
            return ;
        }
        if (y < 0 || y >= m) {
            return;
        }
        if ( grid[y][x] == '1') {
            grid[y][x] = '.';
        } else {
            return;
        }
        infect(grid, x + 1, y);
        infect(grid, x - 1, y);
        infect(grid, x, y + 1);
        infect(grid, x, y - 1);
    }

}
