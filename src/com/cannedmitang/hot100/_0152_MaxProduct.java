package com.cannedmitang.hot100;

public class _0152_MaxProduct {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][2];
        for ( int i = 0; i < n ; i++) {
            dp[i][0] = nums[i];
            dp[i][1] = nums[i];
        }
        for (int j = 1; j < n ; j++) {
            int num = nums[j];
            int max = Math.max(num, Math.max(dp[j-1][0] * num , dp [j-1][1] * num));
            int min = Math.min(num, Math.min(dp[j-1][0] * num , dp [j-1][1] * num));
            dp[j][0] = max;
            dp[j][1] = min;
        }
        int res = dp[0][0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, dp[i][0]);
        }
        return res;
    }

}
