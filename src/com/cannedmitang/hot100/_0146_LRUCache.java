package com.cannedmitang.hot100;

import java.util.HashMap;

public class _0146_LRUCache {

    class LRUCache {

        private int size;

        private int capacity;

        private Node head;

        private Node tail;

        private HashMap<Integer, Node> map;

        public class Node {

            public Node (int key, int val) {
                this.key = key;
                value = val;
            }

            public int key;
            public int value;
            public Node next;
            public Node pre;

        }

        public LRUCache(int capacity) {
            size = 0;
            this.capacity = capacity;
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.pre = head;
            map = new HashMap<>();
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                final Node node = map.get(key);
                remove(node);
                put(node);
                return node.value;
            } else {
                return -1;
            }

        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                final Node node = map.get(key);
                remove(node);
                node.value = value;
                put(node);
            } else {
                size++;
                final Node node = new Node(key, value);
                put(node);
                if (size > capacity) {
                    remove(tail.pre);
                    size--;
                }
            }
        }

        void remove(Node node) {
            node.next.pre = node.pre;
            node.pre.next = node.next;
            map.remove(node.key);
        }

        void put(Node node) {
            final Node next = head.next;
            map.put(node.key, node);
            head.next = node;
            node.next = next;
            next.pre = node;
            node.pre = head;
        }

    }

}
