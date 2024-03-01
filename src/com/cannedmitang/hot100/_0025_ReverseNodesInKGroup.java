package com.cannedmitang.hot100;

public class _0025_ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode root = new ListNode();
        root.next = head;
        ListNode pre = root;
        while (true) {
            ListNode t = nextTail(pre, k);
            if (t == null) {
                break;
            }
            ListNode next = t.next;
            ListNode tail = pre.next;
            t.next = null;
            ListNode newHead = reverse(pre.next);
            pre.next = newHead;
            tail.next = next;
            pre = tail;
        }
        return root.next;
    }

    public ListNode nextTail(ListNode head, int k) {
        while(k > 0) {
            if (head != null) {
                k--;
                head = head.next;
            } else {
                return null;
            }
        }
        return head;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while ( curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

}
