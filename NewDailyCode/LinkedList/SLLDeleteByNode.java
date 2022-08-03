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

    void deleteBySearch(int data) {
        ListNode node = head;
        ListNode prev = node;
        if (node.data == data) {
            head = node.next;
            return;
        }
        while (node.next != null || node.data != data) {
            prev = node;
            node = node.next;
        }
        prev.next = node.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.head = new ListNode(5);
        sList.head.next = new ListNode(7);
        sList.head.next.next = new ListNode(9);
        sList.printList();
        sList.deleteBySearch(9);
        sList.printList();
        sList.deleteBySearch(5);
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
