package com.cannedmitang.hot100;

public class _0148_SortList {

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode root = new ListNode();
        root.next = head;
        ListNode slowNode = root;
        ListNode fastNode = root;
        while (fastNode.next != null && fastNode.next.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        ListNode l = root.next;
        ListNode r = slowNode.next;
        slowNode.next = null;
        return merge(sortList(l), sortList(r));
    }

    public ListNode merge(ListNode l, ListNode r) {
        ListNode root = new ListNode();
        ListNode curr = root;
        while (l != null && r != null) {
            if (l.val < r.val) {
                curr.next = l;
                l = l.next;
            } else {
                curr.next = r;
                r = r.next;
            }
            curr = curr.next;
        }
        if (l == null) {
            curr.next = r;
        }
        if (r == null) {
            curr.next = l;
        }
        return root.next;
    }

}
