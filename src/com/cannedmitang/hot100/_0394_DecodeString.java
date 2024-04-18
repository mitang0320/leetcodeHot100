package com.cannedmitang.hot100;

import java.util.Deque;
import java.util.LinkedList;

public class _0394_DecodeString {

    public String decodeString(String s) {
        StringBuilder curr = new StringBuilder();
        Deque<String> stack = new LinkedList<>();
        Deque<Integer> stackCount = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if ( '0' <= c && c <= '9') {
                count = count * 10 + (c - '0');
            }
            if ('a' <= c && c <= 'z') {
                curr.append(c);
            }
            if (c == '[') {
                stack.push(curr.toString());
                stackCount.push(count);
                curr = new StringBuilder();
                count = 0;
            }
            if (c == ']') {
                final Integer loop = stackCount.pop();
                StringBuilder t = new StringBuilder();
                for (int j = 0; j < loop; j++) {
                    t.append(curr);
                }
                curr = new StringBuilder(stack.pop() + t);
            }
        }
        return curr.toString();
    }

}
