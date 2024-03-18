package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0131_PalindromePartitioning {

    public List<List<String>> partition(String s) {
        process(s.toCharArray(), 0, new ArrayList<>());
        return res;
    }

    List<List<String>> res = new ArrayList<>();

    private void process (char[] chars, int index, List<String> line) {
        if (index == chars.length) {
            res.add(new ArrayList<>(line));
            return;
        }
        for (int i = index; i< chars.length; i++) {
            if (isPalindrome(chars,index,i)) {
                line.add(new String(Arrays.copyOfRange(chars, index, i+1)));
                process(chars, i+1, line);
                line.remove(line.size() - 1);
            }
        }
    }

    private boolean isPalindrome(char[] chars, int l ,int r) {
        if (l == r) {
            return true;
        }
        while (l<r) {
            if (chars[l] != chars[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
