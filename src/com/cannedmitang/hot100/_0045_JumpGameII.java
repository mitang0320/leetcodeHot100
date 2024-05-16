package com.cannedmitang.hot100;

public class _0045_JumpGameII {

    public int jump(int[] nums) {
        int n = nums.length;
        int index = 0;
        int step = 0;
        while (index < n - 1) {
            step ++;
            int length = nums[index];
            int max = 0;
            int next = index;
            for(int i = length; i >= 1; i--) {
                if (index + i >= n - 1) {
                    return step;
                }
                if (nums[index + i] + i > max) {
                    max = nums[index + i] + i;
                    next = index + i;
                }
            }
            index = next;
        }
        return step;
    }

}
