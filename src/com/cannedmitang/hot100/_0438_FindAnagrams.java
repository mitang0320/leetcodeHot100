package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0438_FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) {
            return res;
        }
        final int[] target = count(p, 0, p.length());
        final int[] sCount = count(s, 0, p.length() - 1);
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            ++sCount[s.charAt(i + p.length() - 1) - 'a'];
            if (Arrays.equals(target, sCount)) {
                res.add(i);
            }
            --sCount[s.charAt(i) - 'a'];
        }
        return res;
    }

    private int[] count(String s , int start, int end) {
        int[] res = new int[26];
        for (int i = start; i < end; i++) {
            final int c = s.charAt(i) - 'a';
            res[c]++;
        }
        return res;
    }

}
