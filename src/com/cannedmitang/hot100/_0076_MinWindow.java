package com.cannedmitang.hot100;

public class _0076_MinWindow {

    public String minWindow(String s, String t) {
        int[] counts = new int[256];
        int[] target = count(t);
        int l = 0;
        int r = -1;

        int maxL = 0;
        int maxR = Integer.MAX_VALUE;

        while(l < s.length()) {
            if (has(counts, target)) {
                if ( r - l < maxR - maxL) {
                    maxR = r;
                    maxL = l;
                }
                counts[s.charAt(l++)]--;
            } else {
                if (r == s.length() - 1) {
                    break;
                }
                counts[s.charAt(++r)]++;
            }
        }
        return maxR == Integer.MAX_VALUE ? "" : s.substring(maxL, maxR + 1);

    }

    int[] count(String t) {
        int[] counts = new int[256];
        final char[] chars = t.toCharArray();
        for (int c : chars) {
            counts[c]++;
        }
        return counts;
    }

    boolean has(int[] s, int[] t) {
        for (int i = 0; i < 256; i++) {
            if (s[i] < t[i]) {
                return false;
            }
        }
        return true;
    }

}
