package com.cannedmitang.hot100;

public class _0234_IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        count = count / 2;
        curr = head;
        while(count > 0) {
            count--;
            curr = curr.next;
        }
        ListNode reverse = reverse(curr);
        while (reverse != null) {
            if (reverse.val != head.val) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode t;
        ListNode lastNode = null;
        while (head != null) {
            t = head.next;
            head.next = lastNode;
            lastNode = head;
            head = t;
        }
        return lastNode;
    }

}
