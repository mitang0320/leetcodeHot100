package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.List;

public class _0051_NQueens {

    public List<List<String>> solveNQueens(int n) {
        int[] table = new int[n];
        process(0 ,0,0,0,table);
        return res;
    }

    List<List<String>> res = new ArrayList<>();

    private void process(int index, int l, int c, int r , int[] table) {
        int n = table.length;
        if (index == n) {
            save(table);
            return;
        }
        for (int i = 0; i < n; i++) {
            int target = 1 << i;
            int empty = (l & target) + (c & target) + (r & target);
            if (empty == 0) {
                table[index] = target;
                int newL = (l | target) << 1;
                int newC = c | target;
                int newR = (r | target) >> 1;
                process(index + 1, newL , newC, newR, table);
            }
        }
    }

    private void save(int[] table) {
        int n = table.length;
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int target = table[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n ; j++) {
                if ((target >> j) % 2 == 1) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            lines.add(sb.toString());
        }
        res.add(lines);
    }

}
