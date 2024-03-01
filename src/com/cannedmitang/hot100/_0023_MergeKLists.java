package com.cannedmitang.hot100;

public class _0023_MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeK(lists, 0, lists.length - 1);
    }

    private ListNode mergeK (ListNode[] list, int l, int r) {
        if (l == r) {
            return list [l];
        }
        int mid = l + (( r - l) >> 1);
        ListNode listL = mergeK(list, l , mid);
        ListNode listR = mergeK(list, mid + 1, r);
        return merge (listL, listR);
    }

    private ListNode merge( ListNode l , ListNode r ) {
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
        } else {
            curr.next = l;
        }
        return root.next;
    }
}
