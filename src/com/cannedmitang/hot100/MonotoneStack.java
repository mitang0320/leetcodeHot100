package com.cannedmitang.hot100;

import java.util.Deque;
import java.util.LinkedList;

public class MonotoneStack {

    public static void main(String[] args) {
        int[] test = new int[]{2, 4, 5, 3, 6, 7, 10, 1};
        monotoneStack(test);
    }

    public static void monotoneStack(int[] nums) {
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                int currIndex = stack.pop();
                System.out.println(nums[currIndex]);
            }
            stack.push(i);
        }
    }

}
