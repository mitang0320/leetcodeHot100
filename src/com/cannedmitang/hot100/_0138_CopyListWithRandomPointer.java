package com.cannedmitang.hot100;

public class _0138_CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        if ( head == null) {
            return null;
        }
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node res = curr.next;
        Node copyNode = res;
        Node next;
        Node nextCopy;
        while (true) {
            next = curr.next.next;
            if (next == null) {
                curr.next = null;
                break;
            }
            nextCopy = next.next;
            curr.next = next;
            copyNode.next = nextCopy;
            curr = curr.next;
            copyNode = copyNode.next;
        }
        return res;
    }

}
