package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _0049_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Word, List<String>> map = new HashMap<>();
        for (String key : strs) {
            Word w = new Word(key);
            if (map.containsKey(w)) {
                map.get(w).add(key);
            } else {
                List<String> s = new ArrayList<>();
                s.add(key);
                map.put(w, s);
            }
        }
        return new ArrayList<>(map.values());
    }

    class Word {
        int[] counts;
        Word(String s) {
            final char[] chars = s.toCharArray();
            counts = new int[26];
            for (char c : chars) {
                int index = c - 'a';
                counts[index]++;
            }
        }

        public boolean equals(Object o) {
            return Arrays.equals(counts, ((Word)o).counts);
        }

        public int hashCode() {
            return Arrays.hashCode(counts);
        }


    }

}
