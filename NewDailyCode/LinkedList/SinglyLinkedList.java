package org.example;

public class SinglyLinkedList {

    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        sList.head.next = l2;
        l2.next = l3;
        sList.printList();
        System.out.println();
        System.out.print(sList.lengthOfLinkedList());
    }

    public void printList() {
        ListNode l = head;
        while (l.next != null) {
            System.out.print(l.data+" ");
            l = l.next;
        }
    }

    public int lengthOfLinkedList() {
        ListNode l = head;
        int count = 0;
        while (l.next != null) {
            count++;
            l = l.next;
        }
        return count;
    }
}
