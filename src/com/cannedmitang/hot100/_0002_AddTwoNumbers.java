package com.cannedmitang.hot100;

public class _0002_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode ();
        ListNode curr = root;
        int adds = 0;
        while(l1 != null || l2 != null || adds != 0) {
            int currV = (l1 == null ? 0 : l1.val) +
                    (l2 == null ? 0 : l2.val) + adds;
            if (currV > 9) {
                currV -= 10;
                adds = 1;
            } else {
                adds = 0;
            }
            curr.next = new ListNode(currV);
            curr = curr.next;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return root.next;
    }

}
