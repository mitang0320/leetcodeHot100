package com.cannedmitang.hot100;

import java.util.Arrays;

public class _1143_LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int[][] dp = new int[l1][l2];

        for(int i = 0; i < l1;i++) {
            Arrays.fill(dp[i], -1);
        }
        return process(text1, text2, 0,0,dp);
    }

    int process (String text1, String text2, int index1, int index2 , int[][] dp) {
        int l1 = text1.length();
        int l2 = text2.length();
        if (index1 == l1 || index2 == l2) {
            return 0;
        }
        if (dp[index1][index2] != -1) {
            return dp[index1][index2];
        }
        int res = 0;
        if (text1.charAt(index1) == text2.charAt(index2)) {
            res = process(text1, text2, index1 + 1, index2 + 1, dp) + 1;
        } else {
            int p2 = process(text1, text2, index1, index2 + 1, dp);
            int p3 = process(text1, text2, index1 + 1, index2, dp);
            res += Math.max(p2,p3);
        }
        dp[index1][index2] = res;
        return res;
    }

}
