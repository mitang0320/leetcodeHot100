package com.cannedmitang.hot100;

public class _0160_GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;

        int countA = 0;
        while (currA.next != null) {
            currA = currA.next;
            countA++;
        }
        int countB = 0;
        while (currB.next != null) {
            currB = currB.next;
            countB++;
        }
        if (currA != currB) {
            return null;
        }
        int step = Math.abs(countA - countB);
        if (countA > countB) {
            while (step > 0) {
                headA = headA.next;
                step--;
            }
        } else if (countB > countA) {
            while (step > 0) {
                headB = headB.next;
                step--;
            }
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

}
