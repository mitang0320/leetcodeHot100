package com.cannedmitang.hot100;

import java.util.HashMap;

public class _0560_SubarraySum {

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] sums = new int[n];
        int count = 0;
        sums[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sums[i] = nums[i] + sums[i - 1];
        }
        final HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < n; i++) {
            count += map.getOrDefault(sums[i] - k, 0);
            map.put(sums[i], map.getOrDefault(sums[i], 0) + 1);
        }
        return count;
    }

}
