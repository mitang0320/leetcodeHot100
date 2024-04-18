package com.cannedmitang.hot100;

public class _0153_FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while ( l < r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] <= nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }

}
