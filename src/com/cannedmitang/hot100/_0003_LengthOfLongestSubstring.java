package com.cannedmitang.hot100;

import java.util.HashMap;

public class _0003_LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> keyIndex = new HashMap<>();
        int length = s.length();
        int maxLength = 0;
        int lashIndex = 0;
        for (int i = 0; i < length ; i++) {
            final char c = s.charAt(i);
            if (keyIndex.containsKey(c)) {
                lashIndex = Math.max(keyIndex.get(c) + 1, lashIndex);
            }
            keyIndex.put(c, i);
            int currLength = i - lashIndex + 1;
            if (maxLength < currLength) {
                maxLength = currLength;
            }
        }
        return maxLength;
    }

}
