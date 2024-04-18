package com.cannedmitang.hot100;

public class _0034_FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        if ( nums.length == 0) {
            return new int[]{-1 , -1};
        }
        int l = 0;
        int r = nums.length - 1;
        int m = 0;
        int res = -1;
        while ( l <= r) {
            m = l + ((r - l) >> 1);
            if (nums[m] == target) {
                res = m;
                r = m - 1;
            } else if ( nums[m] > target) {
                res = m;
                r = m - 1;
            } else if ( nums[m] < target) {
                l = m + 1;
            }
        }
        int left = res;
        l = 0;
        r = nums.length - 1;
        m = 0;
        res = -1;
        while (l <= r) {
            m = l + ((r - l)>> 1);
            if (nums[m] == target) {
                res = m;
                l = m + 1;
            } else if (nums[m] > target) {
                r = m -1;
            } else if (nums[m] < target) {
                res = m;
                l = m + 1;
            }
        }
        int right = res;
        if (left <= right && left != -1 && right != -1 && nums[left] == target && nums[right] == target) {
            return new int[]{left, right};
        }
        return new int[]{-1 , -1};
    }

}
