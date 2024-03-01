package com.cannedmitang.hot100;

import java.util.HashMap;

public class _0001_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int choose = nums[i];
            int diff = target - choose;
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(choose, i);
        }
        return null;
    }

}
