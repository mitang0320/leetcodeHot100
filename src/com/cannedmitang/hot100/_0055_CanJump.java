package com.cannedmitang.hot100;

public class _0055_CanJump {

    public boolean canJump(int[] nums) {
        int index = 0;
        int n = nums.length;
        while (true) {
            int length = nums[index];
            int max = 0;
            int maxIndex = 0;
            for (int i = index + 1; i <= index + length && i < n; i++) {
                if (i + nums[i] >= max) {
                    max = i + nums[i];
                    maxIndex = i;
                }
            }
            if (nums[maxIndex] + maxIndex >= nums.length - 1) {
                return true;
            }
            if (maxIndex == 0) {
                return false;
            }
            index = maxIndex;
        }
    }

}
