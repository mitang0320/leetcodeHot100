package com.cannedmitang.hot100;

public class _0004_FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        if (n%2 == 1) {
            return findK(nums1, 0 , nums2, 0, n / 2 + 1);
        } else {
            return (findK(nums1, 0 , nums2, 0 ,n/2 + 1) + findK(nums1, 0, nums2, 0, n/2))/2;
        }
    }

    private double findK(int[] nums1, int i1, int[] nums2, int i2, int k) {
        if( i1 >= nums1.length) {
            return nums2[i2 + k - 1];
        }
        if (i2 >= nums2.length) {
            return nums1[i1 + k -1];
        }
        if (k == 1){
            return Math.min(nums1[i1] , nums2[i2]);
        }
        int mid = k >> 1;
        int move1 = i1 + mid >= nums1.length ? nums1.length - 1 - i1 : mid - 1;
        int move2 = i2 + mid >= nums2.length ? nums2.length - 1 - i2 : mid - 1;
        if ( nums1[i1 + move1] < nums2[i2 + move2]) {
            return findK(nums1, i1 + move1 + 1, nums2, i2, k - (move1 + 1));
        } else {
            return findK(nums1, i1, nums2, i2 + move2 + 1, k - (move2 + 1));
        }
    }

}
