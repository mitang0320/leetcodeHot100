package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _0056_Merge {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> resList = new ArrayList<>();
        int l = intervals[0][0];
        int r = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            int currL = intervals[i][0];
            int currR = intervals[i][1];
            if (currL <= r) {
                r = Math.max(r, currR);
            } else {
                int[] save = new int[2];
                save[0] = l;
                save[1] = r;
                resList.add(save);
                l = currL;
                r = currR;
            }
        }
        int[] save = new int[2];
        save[0] = l;
        save[1] = r;
        resList.add(save);

        int resLength = resList.size();
        int[][] res = new int[resLength][];
        for (int i = 0; i < resLength; i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

}
