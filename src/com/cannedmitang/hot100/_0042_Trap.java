package com.cannedmitang.hot100;

import java.util.Deque;
import java.util.LinkedList;

public class _0042_Trap {

    public int trap(int[] height) {
        int n = height.length;
        int[] plus = new int[n+1];

        for (int i = 0; i < n; i++) {
            plus[i] = height[i];
        }
        Deque<Integer> stack = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            while (!stack.isEmpty() && plus[stack.peek()] < plus[i]) {
                int currIndex = stack.pop();
                if (!stack.isEmpty()) {
                    int w = i - stack.peek() - 1;
                    int h = Math.min(plus[i], plus[stack.peek()]) - plus[currIndex];
                    sum += w * h;
                }
            }
            stack.push(i);
        }
        return sum;
    }

}
