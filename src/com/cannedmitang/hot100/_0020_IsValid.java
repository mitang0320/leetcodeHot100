package com.cannedmitang.hot100;

import java.util.Deque;
import java.util.LinkedList;

public class _0020_IsValid {

    public boolean isValid(String s) {
        if ( s.length() % 2 == 1) {
            return false;
        }
        final char[] chars = s.toCharArray();
        Deque<Character> stack = new LinkedList<>();
        Character t;
        for (char c : chars) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.addFirst(c);;
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    t = stack.pollFirst();
                    if (t != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    t = stack.pollFirst();
                    if (t != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    t = stack.pollFirst();
                    if (t != '{') {
                        return false;
                    }
                    break;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

}
