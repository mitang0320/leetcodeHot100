package com.cannedmitang.hot100;

public class _0019_RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = new ListNode();
        root.next = head;
        int count = n + 1;
        head = root;
        ListNode res = head;
        while (head != null) {
            if (count > 0) {
                count --;
            } else {
                res = res.next;
            }
            head = head.next;
        }
        res.next = res.next.next;
        return root.next;
    }

}
