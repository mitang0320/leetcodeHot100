package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0279_NumSquares {

    public int numSquares(int n) {
        int nlen =  (int)Math.sqrt(n) + 1;
        int[] nn = new int[nlen];
        for (int i = 0; i < nlen; i++) {
            nn[i] = (i + 1) * (i + 1);
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nlen; j++) {
                if (i + nn[j] <= n) {
                    dp[i + nn[j]] = Math.min(dp[i+nn[j]], dp[i] + 1);
                }
            }
        }
        return dp[n];
    }

}
