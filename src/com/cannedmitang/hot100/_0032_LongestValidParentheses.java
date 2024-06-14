package com.cannedmitang.hot100;

public class _0032_LongestValidParentheses {

    public int longestValidParentheses(String s) {
        final char[] arr = s.toCharArray();
        int maxLength = 0;

        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                left ++;
            } else {
                right ++;
            }
            if (left == right) {
                maxLength = Math.max(maxLength, left);
            } else if (right > left ) {
                left = 0;
                right = 0;
            }
        }
        left = 0;
        right = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLength = Math.max(maxLength, left);
            } else if (left > right) {
                left = 0;
                right = 0;
            }
        }
        return maxLength * 2;
    }

}
