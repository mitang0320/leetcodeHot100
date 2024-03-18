package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.List;

public class _0017_LetterCombinations {

    String[] m = new String[]{"","","abc","def","ghi","jkl","mon","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<>();
        }
        final char[] chars = digits.toCharArray();
        return process(chars, 0);
    }

    List<String> process(char[] chars, int index){
        if ( chars.length == index) {
            List<String> line = new ArrayList<>();
            line.add("");
            return line;
        }
        final int aChar = chars[index] - '0';
        final String s = m[aChar];
        final char[] chars1 = s.toCharArray();
        final List<String> process = process(chars, index + 1);
        List<String> res = new ArrayList<>();
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < process.size(); j++) {
                res.add(chars1[i] + process.get(j));
            }
        }
        return res;
    }

}
