package com.cannedmitang.hot100;

public class _0024_SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode();
        root.next = head;
        ListNode curr = root;
        while (curr.next != null && curr.next.next != null) {
            ListNode next = curr.next;
            ListNode nextnext = curr.next.next;
            curr.next = nextnext;
            next.next = nextnext.next;
            nextnext.next = next;
            curr = next;
        }
        return root.next;
    }

}
