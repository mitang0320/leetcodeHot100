package com.cannedmitang.hot100;

/**
 * @author : loso
 * @version : v1.0
 * @date : Created in 2023/11/11 14:38
 * @description :
 * @modified By : loso
 */
public class _206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode nextNode ;
        ListNode lastNode = null;
        while ( head != null) {
            nextNode = head.next;
            head.next = lastNode;
            lastNode = head;
            head = nextNode;
        }
        return lastNode;
    }

}
