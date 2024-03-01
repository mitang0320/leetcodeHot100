package com.cannedmitang.hot100;

import java.util.HashSet;

public class _0128_LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int count = 0;
        int res = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                //说明这部分是开始的数据：头
                count = 1;
                int curr = n;
                while (set.contains(curr + 1)) {
                    //如果存在说明是：中
                    count++;
                    curr++;
                }
                //结束了不满足条件说明到了：尾
                res = Math.max(res, count);
            }
        }
        return res;
    }

}
