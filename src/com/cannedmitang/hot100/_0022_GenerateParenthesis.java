package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.List;

public class _0022_GenerateParenthesis {

    public List<String> generateParenthesis(int n){
        char[] line = new char[n*2];
        process(line, 0, 0, 0, n);
        return res;
    }

    List<String> res = new ArrayList<>();

    private void process(char[] line, int index, int leftCount, int rightCount, int n) {
        if (index == n*2) {
            res.add(new String(line));
            return;
        }
        if (leftCount == rightCount) {
            line[index] = '(';
            process(line, index + 1, leftCount + 1, rightCount, n);
            return;
        }
        if (leftCount< n) {
            line[index] = '(';
            process(line , index + 1, leftCount + 1, rightCount, n);
        }
        if (rightCount < n) {
            line[index] = ')';
            process(line, index + 1, leftCount, rightCount + 1, n);
        }
    }

}
