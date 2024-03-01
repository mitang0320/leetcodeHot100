package com.cannedmitang.hot100;

public class _0053_MaxSubArray {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num: nums) {
            sum = sum > 0 ? sum + num : num;
            max = Math.max(max, sum);
        }
        return max;
    }

}
