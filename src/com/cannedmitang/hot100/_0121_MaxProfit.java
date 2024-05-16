package com.cannedmitang.hot100;

public class _0121_MaxProfit {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;
        int h = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0 ; i--) {
            if (prices[i] > h) {
                h = prices[i];
            }
            res = Math.max(res, h - prices[i]);
        }
        return res;
    }

}
