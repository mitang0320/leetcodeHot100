package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0015_ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int r = n - 1;
            int target = -nums[i];
            for (int l = i + 1; l < r; l++) {
                if (l != i + 1 && nums[l] == nums[l-1]) {
                    continue;
                }
                while (nums[l] + nums[r] > target && r > l) {
                    r--;
                }
                if (l == r) {
                    break;
                }
                if (nums[l] + nums[r] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                }
            }
        }
        return res;
    }

}
