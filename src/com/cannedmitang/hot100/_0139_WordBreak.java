package com.cannedmitang.hot100;

import java.util.List;

public class _0139_WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        Tree dic = new Tree();
        for (String word : wordDict) {
            dic.add(word);
        }
        int[] dp = new int[s.length()];
        return process(s.toCharArray(), 0 ,dic, dp);
    }

    private boolean process(char[] chars, int index, Tree tree, int[] dp) {
        if (index == chars.length) {
            return true;
        }
        if (dp[index] != 0){
            return dp[index] == 1;
        }
        boolean res = false;
        Node curr = tree.root;
        for (int i = index; i < chars.length ; i++ ) {
            curr = curr.path[chars[i] - 'a'];
            if (curr == null) {
                break;
            }
            if (curr.end) {
                res = res || process(chars, i+ 1, tree , dp);
            }
        }
        dp[index] = res ? 1: -1;
        return res;

    }

    public class Node {
        Node[] path;

        boolean pass;

        boolean end;

        Node() {
            path = new Node[26];
        }
    }

    public class Tree {
        Node root = new Node();

        private void add(String s) {
            final char[] chars = s.toCharArray();
            Node curr = root;
            for (char aChar : chars) {
                if (curr.path[aChar - 'a'] == null) {
                    curr.path[aChar - 'a'] = new Node();
                }
                final Node next = curr.path[aChar - 'a'];
                next.pass = true;
                curr = next;
            }
            curr.end = true;
        }
    }


}
