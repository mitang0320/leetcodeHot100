package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.List;

public class _0118_Generate {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        res.add(one);
        if (numRows == 1) {
            return res;
        }
        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        res.add(two);
        if (numRows == 2) {
            return res;
        }
        for (int i = 2 ; i < numRows ; i++) {
            List<Integer> line = new ArrayList<>();
            line.add(1);
            List<Integer> last = res.get(i - 1);
            for (int j = 0; j < i - 1; j++) {
                line.add(last.get(j) + last.get(j+1));
            }
            line.add(1);
            res.add(line);
        }
        return res;
    }

}
