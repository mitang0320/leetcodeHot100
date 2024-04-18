package com.cannedmitang.hot100;

import java.util.Deque;
import java.util.LinkedList;

public class _0155_MinStack {

    class MinStack {

        Deque<Integer> stack;

        Deque<Integer> min;

        public MinStack() {
            stack = new LinkedList<>();
            min = new LinkedList<>();
        }

        public void push(int val) {
            stack.push(val);
            if (min.isEmpty()){
                min.push(val);
            } else {
                final Integer peek = min.peek();
                if (peek < val) {
                    min.push(peek);
                } else {
                    min.push(val);
                }
            }
        }

        public void pop() {
            stack.pop();
            min.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }

}
