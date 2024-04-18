package com.cannedmitang.hot100;

import java.util.Deque;
import java.util.LinkedList;

public class _0084_LargestRectangleArea {

    public int largestRectangleArea(int[] heights) {
        int[] plus = new int[heights.length + 2];
        for (int i = 0; i < heights.length; i++) {
            plus[i+1] = heights[i];
        }
        Deque<Integer> deque = new LinkedList<>();
        int max = 0;
        int n = plus.length;
        for (int i = 0; i < n; i++) {
            while ( !deque.isEmpty() && plus[deque.peek()] > plus[i]) {
                int curr = deque.pop();
                int h = plus[curr];
                int w = deque.isEmpty() ? i - 1 : i - deque.peek() - 1;
                max = Math.max(max, h*w);
            }
            deque.push(i);
        }
        return max;
    }

}
