package com.cannedmitang.hot100;


public class _0416_CanPartition {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum %2 == 1) {
            return false;
        }
        int target = sum >> 1;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            for (int j = target; j >= curr; j--) {
                dp[j] = dp[j] || dp [j - curr];
            }
        }
        return dp[target];
    }

}
