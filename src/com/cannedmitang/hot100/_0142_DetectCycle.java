package com.cannedmitang.hot100;

public class _0142_DetectCycle {

    public ListNode detectCycle(ListNode head) {
        if ( head == null) {
            return null;
        }
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (true) {
            if (fastNode.next == null || fastNode.next.next == null) {
                return null;
            }
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode == slowNode) {
                break;
            }
        }
        slowNode = head;
        while (true) {
            if (slowNode == fastNode) {
                return fastNode;
            }
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
    }

}
