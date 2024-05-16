package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _0763_PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        final int n = s.length();
        int[][] pairs = new int[256][2];
        for (int i = 0 ; i < n; i++) {
            final char c = s.charAt(i);
            int[] pair = pairs[c];
            if (pair[0] == 0) {
                pair[0] = i + 1;
            }
            pair[1] = i + 1;
        }
        List<int[]> pairsList = new ArrayList<>();
        for( int[] pair : pairs) {
            if (pair[0] != 0) {
                pairsList.add(pair);
            }
        }

        pairsList.sort((Comparator.comparingInt(o -> o[0])));
        final ArrayList<Integer> res = new ArrayList<>();
        int l = pairsList.get(0)[0];
        int r = pairsList.get(0)[1];
        for (int i = 1; i < pairsList.size(); i++) {
            final int[] pair = pairsList.get(i);
            int newL = pair[0];
            int newR = pair[1];
            if (newL > r) {
                res.add(r - l + 1);
                l = newL;
                r = newR;
            } else {
                r = Math.max(r, newR);
            }
        }
        res.add(r - l + 1);
        return res;
    }

}
