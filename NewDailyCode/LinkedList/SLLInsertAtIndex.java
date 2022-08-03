package org.example;

//insert a node at index
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

    void insertAtSpecificIndex(int index, int data) {
        ListNode node = head;
        int count = 0;
        while (node.next != null && index != count) {
            node = node.next;
            count++;
        }
        ListNode temp = node.next;
        ListNode newNode = new ListNode(data);
        node.next = newNode;
        newNode.next = temp;
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.head = new ListNode(5);
        sList.insertAtSpecificIndex(0, 6);
        sList.insertAtSpecificIndex(1, 8);
        sList.insertAtSpecificIndex(0, 7);
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
