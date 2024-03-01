package com.cannedmitang.hot100;

import java.util.Deque;
import java.util.LinkedList;

public class _0239_MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return new int[0];
        }
        int[] res = new int[n - k + 1];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
            if (i >= k) {
                if (stack.peekLast() <= (i - k)) {
                    stack.pollLast();
                }
            }
            if (i >= k - 1) {
                res[i - k + 1] = nums[stack.peekLast()];
            }

        }
        return res;
    }

}
