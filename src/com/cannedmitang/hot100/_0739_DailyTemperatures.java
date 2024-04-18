package com.cannedmitang.hot100;

import java.util.Deque;
import java.util.LinkedList;

public class _0739_DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new LinkedList<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for( int i = n - 1; i >=0 ; i--) {
            while ( !deque.isEmpty() && temperatures[i] >= temperatures[deque.peek()]) {
                deque.pop();
            }
            res[i]  = deque.isEmpty() ? 0 : deque.peek() - i;
            deque.push(i);
        }
        return res;
    }

}
