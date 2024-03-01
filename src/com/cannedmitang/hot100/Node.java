package com.cannedmitang.hot100;

/**
 * @author : loso
 * @version : v1.0
 * @date : Created in 2023/11/12 21:53
 * @description :
 * @modified By : loso
 */
public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
