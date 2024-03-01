package com.cannedmitang.hot100;

public class _0208_Trie {

    class Trie {

        class Node{
            Node[] path;
            boolean hasEnd;

            Node() {
                path = new Node[26];
            }
        }

        Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String word) {
            final char[] chars = word.toCharArray();
            Node curr = root;
            for (int i = 0; i < chars.length; i++) {
                final int aChar = chars[i] - 'a';
                if ( curr.path[aChar] == null) {
                    curr.path[aChar] = new Node();
                }
                curr = curr.path[aChar];
            }
            curr.hasEnd = true;
        }

        public boolean search(String word) {
            final char[] chars = word.toCharArray();
            Node curr = root;
            for ( char c : chars) {
                final int aChar = c - 'a';
                if (curr.path[aChar] == null) {
                    return false;
                }
                curr = curr.path[aChar];
            }
            return curr.hasEnd;
        }

        public boolean startsWith(String prefix) {
            final char[] chars = prefix.toCharArray();
            Node curr = root;
            for ( char c : chars) {
                final int aChar = c - 'a';
                if (curr.path[aChar] == null) {
                    return false;
                }
                curr = curr.path[aChar];
            }
            return true;
        }
    }

}
