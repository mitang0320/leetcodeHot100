package com.cannedmitang.hot100;

public class _0005_LongestPalindrome {

    public String longestPalindrome(String s) {
        final char[] chars = s.toCharArray();
        int l = 0;
        int r = 0;
        for (int i = 0; i < chars.length; i++) {
            final int[] len1 = isPalindrome(chars, i ,i);
            final int[] len2 = isPalindrome(chars, i , i+1);
            int[] len;
            if (len2 == null) {
                len = len1;
            } else {
                len = len1[1] - len1[0] > len2[1] - len2[0] ? len1 : len2;
            }
            if (len[1] - len[0] > r - l) {
                r = len[1];
                l = len[0];
            }
        }
        return s.substring(l , r + 1);
    }

    public int[] isPalindrome(char[] chars, int l , int r) {
        if (l < 0 || r >= chars.length || chars[l] != chars[r]) {
            return null;
        }
        while (l - 1>= 0 && r + 1< chars.length && chars[l - 1] == chars[r + 1]) {
            l--;
            r++;
        }
        return new int[]{l , r};
    }

}
