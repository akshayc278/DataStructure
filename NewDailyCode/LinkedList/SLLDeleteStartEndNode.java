package org.example;

//insert a node at beginning/end of LL
class SinglyLinkedList {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void deleteAtStart() {
        head = head.next;
    }

    void deleteAtEnd() {
        ListNode node = head;
        ListNode temp = head;
        while (node.next != null) {
            temp = node;
            node = node.next;
        }
        if (node == head) {
            head = null;
        } else {
            temp.next = node.next;ā
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.head = new ListNode(5);
        sList.head.next = new ListNode(7);
        sList.head.next.next = new ListNode(9);
        sList.printList();
        sList.deleteAtStart();
        sList.printList();
        sList.deleteAtEnd();
        sList.printList();

    }

    void printList() {
        ListNode node = head;
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }
}
