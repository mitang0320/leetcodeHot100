package com.cannedmitang.hot100;

public class _0072_MinDistance {

    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();

        int[][] dp = new int[l1 + 1][l2 + 1];
        return process(word1, word2, 0, 0, dp);
    }

    int process(String word1, String word2, int index1, int index2, int[][] dp) {
        int l1 = word1.length();
        int l2 = word2.length();

        if(index1 == l1) {
            return l2 - index2;
        }
        if (index2 == l2) {
            return l1 - index1;
        }
        if (dp[index1][index2] != 0) {
            return dp[index1][index2] - 1;
        }
        int res;
        if (word1.charAt(index1) == word2.charAt(index2)) {
            res = process(word1, word2, index1 + 1, index2 + 1, dp);
        } else {
            int p1 = process(word1, word2, index1 + 1, index2 + 1, dp) + 1;
            int p2 = process(word1, word2, index1 + 1, index2, dp) + 1;
            int p3 = process(word1, word2, index1, index2 + 1, dp) + 1;

            res = Math.min(p1, Math.min(p2, p3));
        }
        dp[index1][index2] = res + 1;
        return res;
    }


}
